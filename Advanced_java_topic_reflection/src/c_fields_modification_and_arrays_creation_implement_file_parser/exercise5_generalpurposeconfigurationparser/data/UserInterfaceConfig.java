package c_fields_modification_and_arrays_creation_implement_file_parser.exercise5_generalpurposeconfigurationparser.data;

public class UserInterfaceConfig {
	
	private String titleColor;
	private String footerText;
	private short titleFontSize;
	private short footerFontSize;
	
	public String getTitleColor() {
		return titleColor;
	}
	public String getFooterText() {
		return footerText;
	}
	public short getTitleFontSize() {
		return titleFontSize;
	}
	public short getFooterFontSize() {
		return footerFontSize;
	}
	@Override
	public String toString() {
		return "UserInterfaceConfig [titleColor=" + titleColor + ", footerText=" + footerText + ", titleFontSize="
				+ titleFontSize + ", footerFontSize=" + footerFontSize + "]";
	}
	
	
	
	

}
