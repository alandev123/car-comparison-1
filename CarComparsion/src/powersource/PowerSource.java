/**
 * 
 */
package powersource;

import powersource.fuel.Fuel;


/**
 * @author Sean
 *
 */
public interface PowerSource {
	
	double getUtilityRate();
	void setUtilityRate(double newUtilityPercentage);
	
	double milesPerFuelUnit();
	Fuel getFuel();
	String getFuelName();
	double getCO2PerMile();
	double getFuelDollarsPerMile();
	
	
	
}
