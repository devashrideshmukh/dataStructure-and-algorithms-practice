	package objectOrientedProgramming.callCenter;
	
	public class Call {
	
		private Rank rank;
		private Caller caller;
		private Employee employeeHandlingTheCall;
	
		public Call(Caller caller) {
			rank = Rank.RESPONDER;
			this.caller = caller;
		}
	
		public Caller getCaller() {
			return caller;
		}
	
		public Employee getEmployeeHandlingTheCall() {
			return employeeHandlingTheCall;
		}
	
		public Rank getRank() {
			return rank;
		}
	
		public void setCaller(Caller caller) {
			this.caller = caller;
		}
	
		public void setEmployeeHandlingTheCall(Employee employeeHandlingTheCall) {
			this.employeeHandlingTheCall = employeeHandlingTheCall;
		}
	
		public void setRank(Rank rank) {
			this.rank = rank;
		}
	
		public Rank incrementCallsRank() {
			if (rank == Rank.RESPONDER) {
				rank = Rank.MANAGER;
			} else if (rank == Rank.DIRECTOR) {
				rank = Rank.DIRECTOR;
			}
			return rank;
		}
	
		// play recorded message to caller
		public void reply(String message) {
			System.out.println(message);
		}
	
		// disconnect call
		public void disconnect() {
			reply("Thank you for calling!");
		}
		
	}
