package com.fhce.emp.services;

import com.fhce.emp.dao.contratoDao;
import com.fhce.emp.dao.empleadoDao;
import com.fhce.emp.dao.empleadomoduloDao;
import com.fhce.emp.model.contratoModel;
import com.fhce.emp.model.empleadoModel;
import com.fhce.emp.model.empleadomoduloModel;
import com.fhce.emp.obj.contratoObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContratoService {
    @Autowired
    private com.fhce.emp.dao.contratoDao contratoDao;
    @Autowired
    private com.fhce.emp.dao.empleadomoduloDao empleadomoduloDao;
    @Autowired
    private com.fhce.emp.dao.empleadoDao empleadoDao;

    public List<contratoObj> listar(){
        return this.contratoDao.findAll().stream().map(this::convertirAObject).collect(Collectors.toList());
    }

    public void addContrato(contratoObj contratoObj){
        empleadoModel empleadoModel = this.empleadoDao.getEmpleado(contratoObj.getCif());
        if(empleadoModel.get_02tipo_empleado_id().longValue() == (long) 2) {
            empleadomoduloModel empleadomoduloModel = this.empleadomoduloDao.getEmpleadoModulo(contratoObj.getCif());
            if(empleadomoduloModel == null){
                empleadomoduloModel = new empleadomoduloModel();
                empleadomoduloModel.set_01cif(contratoObj.getCif());
                empleadomoduloModel.set_02id_modulo((long) 1);
                empleadomoduloModel.set_03estado(1);
                this.empleadomoduloDao.save(empleadomoduloModel);
            }
        }
        contratoModel cM = new contratoModel(contratoObj.getId(), contratoObj.getCif(), contratoObj.getEmpleado_id(), contratoObj.getNumeroContrato(), contratoObj.getServicio(), contratoObj.getUnidad(), contratoObj.getInicio(), contratoObj.getFin(), contratoObj.getGestion(), contratoObj.getDetalle());
        this.contratoDao.save(cM);
    }

    public List<contratoObj> listarContratos(Long cif, Long empleado){
        return this.contratoDao.getContratos(cif, empleado);
    }


    public void setContrato(contratoObj contratoObj){
        contratoModel cM = new contratoModel(contratoObj.getId(), contratoObj.getCif(), contratoObj.getEmpleado_id(), contratoObj.getNumeroContrato(), contratoObj.getServicio(), contratoObj.getUnidad(), contratoObj.getInicio(), contratoObj.getFin(), contratoObj.getGestion(), contratoObj.getDetalle());
        this.contratoDao.save(cM);
    }

    private contratoObj convertirAObject(contratoModel contratoModel){
        return new contratoObj(contratoModel.getId(), contratoModel.get_01cif(), contratoModel.get_02empleado_id(),contratoModel.get_03numero_contrato(), contratoModel.get_04servicio(), contratoModel.get_05unidad(), contratoModel.get_06inicio(), contratoModel.get_07fin(), contratoModel.get_08gestion(), contratoModel.get_09detalle());
    }

}
