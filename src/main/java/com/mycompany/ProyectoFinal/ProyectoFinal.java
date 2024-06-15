/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ProyectoFinal;

import java.util.ArrayList;

/**
 *
 * @author gabo
 */
public class ProyectoFinal {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Cursos> cursos= new ArrayList<>();
    
    
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
        }
}
