package inff;
class Booking{
    //Implement your code here
	private String customerEmail;
	private int seatsRequirement;
	private boolean isBooked;
	static int seatsAvailable;
	static {
		seatsAvailable=400;
	}
	Booking(String customerEmail,int seatsRequirement){
		this.customerEmail=customerEmail;
		this.seatsRequirement=seatsRequirement;
		
		if(seatsRequirement<=seatsAvailable) {
			isBooked=true;
			seatsAvailable=seatsAvailable-seatsRequirement;
			//System.out.println( seatsAvailable);
		}else {
				isBooked=false;
			}
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequirement() {
		return seatsRequirement;
	}
	public void setSeatsRequirement(int seatsRequirement) {
		this.seatsRequirement = seatsRequirement;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
	
	}


class Te{
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequirement()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}


	


