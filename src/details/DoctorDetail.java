package details;
import entity.Doctor;
import java.util.*;

public class DoctorDetail {
    public static void main(String[] args) {
        Id id = new Id();

        Doctor cardiologistDoctor = new Doctor();
        cardiologistDoctor.setDoctorName("Rahim");
        cardiologistDoctor.setSpecialisation("Cardiologists");

        Doctor orthopedicDoctor = new Doctor();
        orthopedicDoctor.setDoctorName("Vishal");
        orthopedicDoctor.setSpecialisation("Orthopedic");

        Doctor dentistDoctor = new Doctor();
        dentistDoctor.setDoctorName("Suganya");
        dentistDoctor.setSpecialisation("Dentist");

        Doctor neurologistDoctor = new Doctor();
        neurologistDoctor.setDoctorName("Anu");
        neurologistDoctor.setSpecialisation("Neurologist");

        Doctor pulmonologistDoctor = new Doctor();
        pulmonologistDoctor.setDoctorName("VelRaj");
        pulmonologistDoctor.setSpecialisation("Pulmonologist");

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(cardiologistDoctor);
        doctorList.add(orthopedicDoctor);
        doctorList.add(dentistDoctor);
        doctorList.add(neurologistDoctor);
        doctorList.add(pulmonologistDoctor);

        AppointmentDetail appointmentDetail = new AppointmentDetail(doctorList);

        appointmentDetail.display();

        Map<Long, Doctor> doctorsId = new HashMap<>();
        doctorsId.put(id.getId(), cardiologistDoctor);
        doctorsId.put(id.getId(), orthopedicDoctor);
        doctorsId.put(id.getId(), dentistDoctor);
        doctorsId.put(id.getId(), neurologistDoctor);
        doctorsId.put(id.getId(), pulmonologistDoctor);

    }
}

