public enum CountryCode {
	EN("England"), UA("Ukraine"), I("Italy"), S("Spain");
	
	private final String fullName;
	
	private CountryCode(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}
}
