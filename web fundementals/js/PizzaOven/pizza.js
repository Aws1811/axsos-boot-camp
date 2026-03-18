    var pizzaOven ={
        "crust" : ["(deep Dish)","(Hand Tossed)","(Traditional)"],
        "cheese": ["(mozzarella)","(Cheddar)","(feta)"],
        "Sauce": ["(Tomato Sauce)","(Garlic Sauce)","(Marinara sauce)"],
        "Sausage":["(Pepperoni)","(Italian Sausage)","(Beef Sausage)"],
        "Extra" : ["(Olives)","(Onions)","(Mushrooms)"],
    }
    var randomcurst = Math.floor(Math.random() * 3);
    var randomchesse = Math.floor(Math.random() * 3);
    var randomsauce =Math.floor(Math.random() * 3);
    var randomsausage =Math.floor(Math.random() * 3);
    var randomextra =Math.floor(Math.random() * 3);
    var randompizza = pizzaOven.crust[randomcurst] + pizzaOven.cheese[randomchesse] + pizzaOven.Sauce[randomsauce] +pizzaOven.Sausage[randomsausage] + pizzaOven.Extra[randomextra];
    
    function pizza() {
        var pizza1 = pizzaOven.crust[0]+" "+pizzaOven.cheese[0]+" "+pizzaOven.Sausage[0];
        var pizza2 = pizzaOven.crust[1]+" " + pizzaOven.cheese[0] + " " +pizzaOven.cheese[ 2]+" "+pizzaOven.Sauce[2] +" "+pizzaOven.Extra;
        var pizza3 = pizzaOven.crust[2]+" " + pizzaOven.cheese[1] + " " + pizzaOven.Sauce[1] + " " + pizzaOven.Sausage[1];
        var pizza4 = randompizza;
        return pizza1+ "\n" +pizza2 + "\n"+pizza3+ "\n" +pizza4;
    }
    console.log(pizza());

















    // var randompizza = pizzaOven.crust[randomIndex1] +pizzaOven.cheese[randomIndex1]+pizzaOven.Sauce[randomIndex1]+pizzaOven.Sausage[randomIndex1]+pizzaOven.Extra[randomIndex1];
    // var randompizza = pizzaOven.crust[randomIndex2] +pizzaOven.cheese[randomIndex2]+pizzaOven.Sauce[randomIndex2]+pizzaOven.Sausage[randomIndex2]+pizzaOven.Extra[randomIndex2];

