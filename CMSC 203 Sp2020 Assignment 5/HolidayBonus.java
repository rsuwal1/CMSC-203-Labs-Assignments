public class HolidayBonus {
	//Empty Constructor
	public HolidayBonus()
	{
		
	}

	/**
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonuses array
	 */    
    public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other)
    {
    	double[] bonuses = new double[data.length];
    	
    		int row = 0;
    		do{
    			int col = 0;
    			do{
    				if (data[row][col] >= 0)
    					{
    					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col))
    						bonuses[row] += high;
    					else if (data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col))
    						bonuses[row] += low;
    					else
    						bonuses[row] += other;
    					col++;
    					}
    				}while(col < data[row].length);
    			row++;
    		}while (row < bonuses.length);
    	return bonuses;
    }
    

    /**
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonusTotal
	 */
    public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other){
        double bonusTotal = 0;
        double[] bonuses = calculateHolidayBonus(data, high, low, other);
        
        for (int i = 0; i < bonuses.length; i++) {
			bonusTotal += bonuses[i];
		}
		return bonusTotal;
    }

}