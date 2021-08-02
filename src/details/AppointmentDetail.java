package details;
import entity.*;
import java.util.*;

public class AppointmentDetail {
    private List<Doctor> listOfDoctors;
    private List<Patient> listOfPatients;

    public AppointmentDetail(List<Doctor> doctorList) {
        this.listOfDoctors = doctorList;
    }

    /*public AppointmentDetail(List<Patient> patientList) {
        this.listOfPatients = patientList;
    }*/

    public void display() {
        Id id = new Id();/*
        DateOfVisit date = new DateOfVisit();
        Appointment appointment = new Appointment();
        appointment.setPatientId(id.getId());
        appointment.setDateOfVisit(date.getDate());
        appointment.setPurposeOfVisit("Cardiologists");
        appointment.setIsFirstVisit("yes");
        appointment.setBp(120);
        appointment.setTemperature(80);*/

        for ( Doctor d : listOfDoctors) {
            System.out.println(d.getSpecialisation());
            }
        }
    }


