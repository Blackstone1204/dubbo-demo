/**
 * 
 */
package me.model;

import java.util.Arrays;
import java.util.List;

import me.service.Resource;

/**
 * @author BlackStone
 *
 */
public class CPU implements Resource{

	private String currentV;
	private String min;
	private String max;
	private String avg;
	/* (non-Javadoc)
	 * @see me.service.Resource#getValue()
	 */
	@Override
	public List<String> getValue() {
		
		return Arrays.asList("1","2","3","4");

	}


	/**
	 * @return the currentV
	 */
	public String getCurrentV() {
		return currentV;
	}


	/**
	 * @param currentV the currentV to set
	 */
	public void setCurrentV(String currentV) {
		this.currentV = currentV;
	}


	/**
	 * @return the min
	 */
	public String getMin() {
		return min;
	}


	/**
	 * @param min the min to set
	 */
	public void setMin(String min) {
		this.min = min;
	}


	/**
	 * @return the max
	 */
	public String getMax() {
		return max;
	}


	/**
	 * @param max the max to set
	 */
	public void setMax(String max) {
		this.max = max;
	}


	/**
	 * @return the avg
	 */
	public String getAvg() {
		return avg;
	}


	/**
	 * @param avg the avg to set
	 */
	public void setAvg(String avg) {
		this.avg = avg;
	}


	@Override
	public String getType() {
		
		return "cpu";

	}

}
