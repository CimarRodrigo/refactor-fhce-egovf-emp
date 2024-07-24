package com.fhce.emp.services;

import com.fhce.emp.dao.empleadoDao;
import com.fhce.emp.dao.empleadomoduloDao;
import com.fhce.emp.dao.tipoempleadoDao;
import com.fhce.emp.dao.contratoDao;
import com.fhce.emp.model.contratoModel;
import com.fhce.emp.model.empleadoModel;
import com.fhce.emp.model.empleadomoduloModel;
import com.fhce.emp.obj.contratoObj;
import com.fhce.emp.obj.empleadoObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpleadoService {

    @Autowired
    private empleadoDao empleadoDao;
    @Autowired
    private empleadomoduloDao empleadomoduloDao;
    @Autowired
    private tipoempleadoDao tipoempleadoDao;
    @Autowired
    private contratoDao contratoDao;
    public List<empleadoObj> listar() {
        return empleadoDao.findAll().stream().map(this::convertirAObj).collect(Collectors.toList());
    }

    public List<empleadoObj> getListaEmpleado(Long tipo) {
        List<empleadoObj> listaEmpleadoObj = new ArrayList<>();
        List<empleadoModel> lE = this.empleadoDao.getListaEmpleado(tipo, 1);
        for(int i = 0; i < lE.size(); i++){
            listaEmpleadoObj.add(convertirAObj(lE.get(i)));
        }
        return listaEmpleadoObj;
    }

    public void addEmpleado(empleadoObj empleado){
        empleadoModel eM = new empleadoModel(empleado.getId(), empleado.getCif(), empleado.getTipoempleado_id(),
                empleado.getFecha(), empleado.getEstado(), empleado.getSalida());
        empleadoModel empladoGuardado = this.empleadoDao.save(eM);
        // return convertirAObj(empladoGuardado);
    }

    public void updateEmpleado(empleadoObj empleado){
        empleadomoduloModel aux;
        List<empleadomoduloModel> listaEmpleadoModulo = this.empleadomoduloDao.getCif(empleado.getCif());
        for(int i = 0; i < listaEmpleadoModulo.size(); i++){
            aux = listaEmpleadoModulo.get(i);
            aux.set_03estado(empleado.getEstado());
            this.empleadomoduloDao.save(aux);
        }
        empleadoModel eM = new empleadoModel(empleado.getId(), empleado.getCif(), empleado.getTipoempleado_id(), empleado.getFecha(), empleado.getEstado(), empleado.getSalida());
        this.empleadoDao.save(eM);
    }

    public empleadoObj getEmpleado(Long cif){
        empleadoObj empleadoObj = new empleadoObj();
        empleadoModel empleadoModel = this.empleadoDao.getEmpleado(cif);
        if(empleadoModel == null)
            return empleadoObj;

        empleadoObj.setId(empleadoModel.getId());
        empleadoObj.setEstado(empleadoModel.get_04estado());
        empleadoObj.setEmpleado(this.tipoempleadoDao.getTipoempleado(empleadoModel.get_02tipo_empleado_id()).get_01detalle());
        empleadoObj.setTipoempleado_id(empleadoModel.get_02tipo_empleado_id());
        empleadoObj.setFecha(empleadoModel.get_03fecha());
        empleadoObj.setSalida(empleadoModel.get_05salida());

        //List<contratoObj>contratoObj=new ArrayList<>();
        List<contratoObj>contratoObj= this.contratoDao.getContratos(cif, empleadoObj.getId());
        //for(int i=0;i<contratoModel.size();i++) {
            //Long id, String numeroContrato, String servicio, String unidad,String inicio, String fin, int gestion, String detalle
            //contratoObj auxXontrato=new contratoObj(contratoModel.get(i).getId(),contratoModel.get(i).getNumeroContrato(),contratoModel.get(i).getServicio(),contratoModel.get(i).getUnidad(),contratoModel.get(i).getInicio(),contratoModel.get(i).getFin(),contratoModel.get(i).getGestion(),contratoModel.get(i).getDetalle());
          //  contratoObj.add(contratoModel.get(i));
        //}
        empleadoObj.setContratos(contratoObj);
        return empleadoObj;

    }

    private empleadoObj convertirAObj(empleadoModel em){
        return new empleadoObj(em.getId(), em.get_01cif(), em.get_02tipo_empleado_id()
         ,em.get_03fecha(), em.get_04estado(), em.get_05salida());
    }
}
