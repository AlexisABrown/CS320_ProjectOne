/* Appointment Class Requirements

    The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
    The appointment object shall have a required appointment Date field. The appointment Date field cannot be in the past. The appointment Date field shall not be null.
    Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
    The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
*/

package AppointmentService;
import java.util.Date;

public class Appointment {
	private String appointmentId;
	private Date appointmentDate;
	private String appointmentDescription;
	
	public Appointment(String appointmentId, Date appointmentDate, String appointmentDescription) {
		if(appointmentId == null || appointmentId.length()>10) {
			throw new IllegalArgumentException("ID needs to be between 1 and 10 characters");
		}
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("First name needs to be between 1 and 10 characters");
		}
		if(appointmentDescription == null || appointmentDescription.length()>50) {
			throw new IllegalArgumentException("Description needs to be between 1 and 50 characters");
		}
		this.setAppointmentId(appointmentId);
		this.setDate(appointmentDate);
		this.setAppointmentDescription(appointmentDescription);
	}

	//Getters and Setters 
	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDate() {
		return appointmentDate;
	}

	public void setDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentDescription() {
		return appointmentDescription;
	}

	public void setAppointmentDescription(String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}
}
