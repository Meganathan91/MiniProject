package details;

import entity.Medicine;

import java.util.*;

public class MedicineDetail {
    public static void main(String[] args) {
        Id id = new Id();
        Medicine medicine = new Medicine();
        medicine.setMedicineId(id.getId());
        //medicine.setBatchNumber(300414);
        medicine.setMedicineName("PARACETAMOL TABLETS");
        //medicine.setExpiryDate(12/03/2017);
        medicine.setPurposeOfMedicine("relief of pain and suffering");
        List<Medicine> medicineDetail = new ArrayList<>();
        medicineDetail.add(medicine);
    }
}
