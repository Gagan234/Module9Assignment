package org.example;

//interface for factory
interface Factory
{
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}


//Makes a Factory for the ProfessionalClothing
class ProfFac implements Factory
{
    @Override
    public Top createTop()
    {
        return new ProfTop();
    }

    @Override
    public Pants createPants()
    {
        return new ProfPants();
    }

    @Override
    public Shoes createShoes()
    {
        return new ProfShoes();
    }
}


//Creates a CausalClothings Factory
class CasualFac implements Factory
{
    @Override
    public Top createTop()
    {
        return new CasualTop();
    }

    @Override
    public Pants createPants()
    {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes()
    {
        return new CasualShoes();
    }
}


//Creates a Party Clothing Factory
class PartyFac implements Factory
{
    @Override
    public Top createTop()
    {
        return new PartyTop();
    }

    @Override
    public Pants createPants()
    {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes()
    {
        return new PartyShoes();
    }
}

//interface for top-type clothings

interface Top
{
    String getDescription();
}


class ProfTop implements Top
{
    @Override
    public String getDescription()
    {
        return "Professional Top";
    }
}

class CasualTop implements Top
{
    @Override
    public String getDescription()
    {
        return "Casual Top";
    }
}

class PartyTop implements Top
{
    @Override
    public String getDescription()
    {
        return "Party Top";
    }
}

//interface for pants
interface Pants
{
    String getDescription();
}


class ProfPants implements Pants
{
    @Override
    public String getDescription()
    {
        return "Professional Pants";
    }
}

class CasualPants implements Pants
{
    @Override
    public String getDescription()
    {
        return "Casual Pants";
    }
}

class PartyPants implements Pants
{
    @Override
    public String getDescription()
    {
        return "Party Pants";
    }
}

//interface for shoes
interface Shoes
{
    String getDescription();
}


class ProfShoes implements Shoes
{
    @Override
    public String getDescription()
    {
        return "Professional Shoes";
    }
}

class CasualShoes implements Shoes
{
    @Override
    public String getDescription()
    {
        return "Casual Shoes";
    }
}

class PartyShoes implements Shoes
{
    @Override
    public String getDescription()
    {
        return "Party Shoes";
    }
}

//Driver Class to test the code
public class Main
{
    public static void main(String[] args)
    {

        Factory professionalFactory = new ProfFac();
        Top professionalTop = professionalFactory.createTop();
        Pants professionalPants = professionalFactory.createPants();
        Shoes professionalShoes = professionalFactory.createShoes();


        System.out.println("Professional Garments:");
        System.out.println(professionalTop.getDescription());
        System.out.println(professionalPants.getDescription());
        System.out.println(professionalShoes.getDescription());


        Factory casualFactory = new CasualFac();
        Top casualTop = casualFactory.createTop();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();

        System.out.println("");
        System.out.println("Casual Garments:");
        System.out.println(casualTop.getDescription());
        System.out.println(casualPants.getDescription());
        System.out.println(casualShoes.getDescription());


        Factory partyFactory = new PartyFac();
        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();

        System.out.println("");
        System.out.println("Party Garments:");
        System.out.println(partyTop.getDescription());
        System.out.println(partyPants.getDescription());
        System.out.println(partyShoes.getDescription());



    }
}