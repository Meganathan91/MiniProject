package details;
import entity.Appointment;
import entity.Patient;
import java.util.*;

public class PatientDetail {
    public static void main(String[] args) {
        Id id = new Id();

        Patient patientSelvam = new Patient();
        patientSelvam.setPatientName("Selvam");
        //patientSelvam.setDob("12/03/1997");
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setPatientType("OP");

        Patient patientRagu = new Patient();
        patientRagu.setPatientName("Ragu");
        //patientRagu.setDob("23/07/1989");
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setPatientType("OP");

        Patient patientVimal = new Patient();
        patientVimal.setPatientName("Vimal");
        //patientVimal.setDob("20/08/1978");
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setPatientType("OP");

        Patient patientAnu = new Patient();
        patientAnu.setPatientName("Anu");
        //patientAnu.setDob("10/07/2000");
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setPatientType("OP");

        Patient patientMohan = new Patient();
        patientMohan.setPatientName("Mohan");
        //patientMohan.setDob("09/07/1991");
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setPatientType("IP");

        Patient patientRajini = new Patient();
        patientRajini.setPatientName("Rajini");
        //patientRajini.setDob("19/09/1996");
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setPatientType("IP");

        Patient patientSomu = new Patient();
        patientSomu.setPatientName("Somu");
        //patientSomu.setDob("11/02/2000");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("IP");

        Patient patientSelvi = new Patient();
        patientSelvi.setPatientName("Selvi");
        //patientSelvi.setDob("18/11/1990");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("IP");

        Patient patientUdhaya = new Patient();
        patientUdhaya.setPatientName("Udhaya");
        //patientUdhaya.setDob("17/10/1991");
        patientUdhaya.setPhoneNumber("9894476540");
        patientUdhaya.setPatientType("IP");

        Patient patientMala = new Patient();
        patientMala.setPatientName("Mala");
        //patientMala.setDob("09/11/1981");
        patientMala.setPhoneNumber("9840349801");
        patientMala.setPatientType("IP");

        Patient patientAjith = new Patient();
        patientAjith.setPatientName("Ajith");
        //patientAjith.setDob("21/01/1989");
        patientAjith.setPhoneNumber("9600870149");
        patientAjith.setPatientType("IP");

        List<Patient>  patientList = new ArrayList<>();
        patientList.add(patientAjith);
        patientList.add(patientAnu);
        patientList.add(patientMala);
        patientList.add(patientMohan);
        patientList.add(patientRagu);
        patientList.add(patientRajini);
        patientList.add(patientSelvam);
        patientList.add(patientSelvi);
        patientList.add(patientSomu);
        patientList.add(patientUdhaya);
        patientList.add(patientVimal);

        Patient patient = new Patient();

        Map<Long,Patient> patientsId = new HashMap<>();
        patientsId.put(id.getId(),patientAjith);
        patientsId.put(id.getId(),patientAnu);
        patientsId.put(id.getId(),patientMala);
        patientsId.put(id.getId(),patientMohan);
        patientsId.put(id.getId(),patientRagu);
        patientsId.put(id.getId(),patientRajini);
        patientsId.put(id.getId(),patientSelvam);
        patientsId.put(id.getId(),patientSelvi);
        patientsId.put(id.getId(),patientSomu);
        patientsId.put(id.getId(),patientUdhaya);
        patientsId.put(id.getId(),patientVimal);

    }
}
