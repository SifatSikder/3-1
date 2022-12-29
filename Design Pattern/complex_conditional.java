public class MyClass {
 
    
    private bool insufficient_change_or_basic_ingridients()
    {
        return change < cup_price || !are_cup_sufficient || !is_hot_water_sufficient || ! is_coffee_powder_sufficient;
    }
    
    private bool does_coffee_contains_cream()
    {
        return coffeeType = CoffeeType.cream || coffeeType = CoffeeType.cream_and_sugar;
    }
    
    private bool does_coffee_contains_sugar()
    {
        return coffeeType = CoffeeType.sugar || coffeeType = CoffeeType.cream_and_sugar;
    }
    
    private bool insufficient_ingridients_to_make_cream_coffee()
    {
        return does_coffee_contains_cream() && !is_cream_powder_sufficient;
    }
    
    private bool insufficient_ingridients_to_make_sugar_coffee()
    {
        return does_coffee_contains_sugar() && !is_sugar_sufficient;
    }
    
    private void mix_basic_coffee_ingridients()
    {
        cups--;
        hot_water -= cup_hot_water;
        coffee_powder -= cup_coffee_water;
    }
    
    private void mix_cream_powder()
    {
        cream_powder -= cup_cream_powder;
    }
    
    
    private void mix_sugar()
    {
        sugar -= cup_sugar;
    }
    
    
    private void make_coffee()
    {
               
        mix_basic_coffee_ingridients();
        
        if(does_coffee_contains_cream())
        {
            mix_cream_powder();
        }
        
        if(does_coffee_contains_sugar())
        {
            mix_sugar();
        }
    }
    
    
    
    
    
    
    
    public bool ProvideCoffee(CoffeeType coffeeType)
    {
        if(insufficient_change_or_basic_ingridients()  || insufficient_ingridients_to_make_cream_coffee() || insufficient_ingridients_to_make_sugar_coffee() )
        {
            return false;
        }
        
        make_coffee();
        return_change();
        return true;
    }
 
 
 
 
 
}