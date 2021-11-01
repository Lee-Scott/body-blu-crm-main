package bodyblucrm.bodyblucrm.model;

import bodyblucrm.bodyblucrm.model.BaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Appointment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    private int clientId;

    private int doctorId;

    private List[] serviceCompleted;

   private List[] servicessDeleted;

   private String location; // TODO check constancy

}
