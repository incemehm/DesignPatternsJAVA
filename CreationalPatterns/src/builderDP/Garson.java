package builderDP;

public class Garson {
	 private Usta usta;
	 
	 public void SetUstaAndCreateKebap(Usta usta)
     {
         this.usta = usta;

         // Kebabı yarat
         this.usta.CreateKebap();

         // Kebabın özelliklerini ata.
         this.usta.SetKebapProperties();
     }

     public Kebap GetKebap()
     {
         return usta.GetKebap();
     }
}
