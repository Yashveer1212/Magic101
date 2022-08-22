

public class MagicDriver
{
    public static void main(String[]args)
    {
        //Create all enemy and ElectricWizard objects
        FireWizard Scorpion = new FireWizard("Scorpion",true,"Vulk",5);
        FireWizard Tarantulas  = new FireWizard("Tarantulas",false,"Larry",-3);

        Dragon Toothless = new Dragon("Toothless",true,10,EnemyType.Dragon,10,7);
        Dragon ToothFull  = new Dragon("ToothFull",false,8,EnemyType.Dragon, 4,10);

        IceWizard SubZero = new IceWizard("SubZero",false,7,EnemyType.IceWizard, Elements.ICE);
        IceWizard NotSubZero = new IceWizard("NotSubZero",true,4,EnemyType.FireWizard, Elements.FIRE);

        ElectricWizard Surge = new ElectricWizard("Surge","Brandon",5,10);
        ElectricWizard Thor = new ElectricWizard("Thor","Sam",6,4);


        //validate each of the enemy objects
        Scorpion.validate();
        Tarantulas .validate();

        System.out.println("Is " + Toothless.getName()+ " a real Dragon? " + Toothless.validate());
        System.out.println("Is " + ToothFull .getName()+ " a real Dragon? " + ToothFull .validate());

        SubZero.validate();
        NotSubZero.validate();

        System.out.println();

        //fix the objects that need to be validated
        Tarantulas .setFireball(2);

        ToothFull .setFireSlash (true);

        NotSubZero.setSubZerosElement (Elements.AIR);

        System.out.println();
        //validate the objects again
        Tarantulas .validate();

        System.out.println("Is " + ToothFull .getName()+ " a real Dragon? " + ToothFull .validate());

        NotSubZero.validate();

        System.out.println();
        //print out the enemies you are facing and their toStrings
        Enemies[] myEnemies = {Scorpion,Tarantulas ,Toothless,ToothFull ,SubZero,NotSubZero};

        for(int i = 0; i < myEnemies.length; i++)
        {
            System.out.println(myEnemies[i]);
        }
        //Display how many of each enemey and ElectricWizards there are
        Scorpion.displayNumFireWizards();
        Toothless.displayNumDragons();
        SubZero.displayNumIceWizards();


    }//end of Main method
}//end Magic driver

