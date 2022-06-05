<<<<<<< HEAD
package ch07;

public class GenericPrinter<T extends Material> {

		private T material;

		public T getMaterial() {
			return material;
		}

		public void setMaterial(T material) {
			this.material = material;
		}
		
		public String toString() {
			return material.toString();
		}
}
=======
package ch07;

public class GenericPrinter<T extends Material> {

		private T material;

		public T getMaterial() {
			return material;
		}

		public void setMaterial(T material) {
			this.material = material;
		}
		
		public String toString() {
			return material.toString();
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
