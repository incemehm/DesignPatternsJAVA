package builderDP;

public class Garson {
	 private Usta usta;
	 
	 public void SetUstaAndCreateKebap(Usta usta)
     {
         this.usta = usta;

         // Kebab� yarat
         this.usta.CreateKebap();

         // Kebab�n �zelliklerini ata.
         this.usta.SetKebapProperties();
     }

     public Kebap GetKebap()
     {
         return usta.GetKebap();
     }
}
