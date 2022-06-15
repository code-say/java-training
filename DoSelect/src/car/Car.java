package car;

public class Car {
		private String model;
		private int maxspeed;
		private int year;
		public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		public int getMaxspeed() {
			return maxspeed;
		}
		public void setMaxspeed(int maxspeed) {
			this.maxspeed = maxspeed;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public void startcar()
		{
			this.maxspeed+=10;
		}
		
		@Override
		public String toString() {
			return "Car [model=" + model + ", maxspeed=" + maxspeed + ", year=" + year + ", getModel()=" + getModel()
					+ ", getMaxspeed()=" + getMaxspeed() + ", getYear()=" + getYear() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}	

	}
