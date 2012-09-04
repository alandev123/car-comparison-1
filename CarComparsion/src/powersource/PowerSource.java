/**
 * 
 */
package powersource;

import powersource.fuel.FuelUnitInterface;


/**
 * @author Sean
 *
 */
public interface PowerSource {
	
	double getUtilityRate();
	void setUtilityRate(double newUtilityPercentage);
	
	double milesPerFuelUnit();
	FuelUnitInterface getFuel();
	String getFuelName();
	double getCO2PerMile();
	double getFuelDollarsPerMile();
	
	
	
}
