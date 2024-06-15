/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ProyectoFinal;
import java.util.ArrayList;
import java.time.LocalTime;

/**
 *
 * @author gabo
 */
public class Cursos {
    public String id;
    public String nombre;
    public String seccion;
    public String fechainicio;
    public String fechafin;
    public String horaInicio;
    public String horaFin;
    public String profesor;
    public String nota;
    public ArrayList<Alumno> Alumnos = new ArrayList<>();
    public static int contador = 1;

    
}