package com.prueba.nova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.nova.model.CuentaCorriente;

//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface ICuentaCorrienteRepo extends JpaRepository<CuentaCorriente, String>{

}
