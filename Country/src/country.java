//program to find the largest country based on area and population
public class country {

	String countryName;
	double population;
	double area;
	double area1, area2, area3;
	int population1, population2, population3;

	public country(String countryName, int population, double area) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}

	// method to find the large country based on area
	public double largeArea(double area1,double area2,double area3) {
		
		if(area1>area2&&area1>area3)
		{
		
			//System.out.println("countr1 is larger"+area1);
			return area1;
		}
		else if(area2>area3)
		{
			//System.out.println("country 2 is larger"+area2);
			return area2;
			
		}
		else
		{
			//System.out.println("country3 is larger"+area3);
			return area3;
		}
		
		//method to find the largest country based on population
		public double  largePop( double  population1, double  population2, double  population3)
		{
			
			if(population1>population&&population1>population3)
			{
				//System.out.println("countr1 is larger"+population1);
				return  population1;
			}
			else if(population2>population3)
			{
				//System.out.println("country 2 is larger"+population3);
				return  population2;
				
			}
			else
			{
				//System.out.println("country3 is larger"+population3);
				return  population3;
			}
			
		}
		
		
		
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int largePop(int pop1, int pop2, int pop3) {
		// TODO Auto-generated method stub
		return 0;
	}

}
