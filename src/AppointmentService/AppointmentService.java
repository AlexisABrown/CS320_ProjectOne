/* Appointment Service Requirements

    The appointment service shall be able to add appointments with a unique appointment ID.
    The appointment service shall be able to delete appointments per appointment ID.
*/

package AppointmentService;
import java.util.Date;
import java.util.Vector;

import AppointmentService.Appointment;

public class AppointmentService {
	private Vector<Appointment> appointmentList = new Vector<Appointment>();
	
	//gets list of appointments
	public Vector<Appointment> GetAppointmentList(){
		return appointmentList;
	}
	public boolean update(String appointmentId, Date appointmentDate, String appointmentDescription) {
	       for (Appointment a : appointmentList) {
	           if (a.getAppointmentId().equals(appointmentId)) {
	               if (!appointmentId.equals(""))
	                   a.setAppointmentId(appointmentId);
	               if (!appointmentDate.equals(""))
	                   a.setDate(appointmentDate);
	               if (!appointmentDescription.equals(""))
	                   a.setAppointmentDescription(appointmentDescription);
	               return true;
	           }
	       }
	       return false;
	   }
	public Object add(String appointmentId, Date appointmentDate, String appointmentDescription) {
		return null;
	}
}