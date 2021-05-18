package cts.pacuraru.diana.g1094.pattern.chain;

public class CheckInjuriesUtils {
	
	private CheckInjuriesUtils() {
		//
	}

	public static boolean isInjured(FisaAccident fisaAccident) {
		
		if (fisaAccident.areMembreRupte == false 
				&& fisaAccident.areRaniDeschise == false
				&& fisaAccident.esteConstient == true
				&& fisaAccident.sePoateDeplasa == true) {
			return false;
			
		}
		else
			return true;
	}
	
	public static boolean isLightInjury(FisaAccident fisaAccident) {
		
		if(fisaAccident.areMembreRupte == false 
				&& fisaAccident.areRaniDeschise == true
				&& fisaAccident.esteConstient == true
				&& fisaAccident.sePoateDeplasa == true)
			return true;
		else
			return false;
	}
	
	public static boolean isMediumInjury(FisaAccident fisaAccident) {
		if(fisaAccident.areMembreRupte == false 
				&& fisaAccident.areRaniDeschise == true
				&& fisaAccident.esteConstient == true
				&& fisaAccident.sePoateDeplasa == false)
			return true;
		else
			return false;
		
	}
	
	public static boolean isSeriousInjury(FisaAccident fisaAccident) {
		if(fisaAccident.areMembreRupte == true 
				&& fisaAccident.areRaniDeschise == true
				|| fisaAccident.esteConstient == true
				&& fisaAccident.sePoateDeplasa == false)
			return true;
		else
			return false;
}}
