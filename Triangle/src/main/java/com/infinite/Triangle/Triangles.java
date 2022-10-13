package com.infinite.Triangle;

public class Triangles {
	
		private String type;
		private int height;
		
		
		

		public void setType(String type) {
			this.type = type;
		}



		public void setHeight(int height) {
			this.height = height;
		}


		public void draw() {
			System.out.println(this.type+" Triangle is drawn of height : "+this.height);
		}
		

	}

