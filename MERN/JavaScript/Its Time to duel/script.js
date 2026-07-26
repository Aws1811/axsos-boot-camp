class Card {
    constructor(name,cost){
        this.name = name,
        this.cost = cost
    }
}

//  soldier
class Unit extends Card{
    constructor(name,cost,power,res){
        super(name,cost)
        this.power = power
        this.res = res
    }
    // attack goes from the unit to another unit (target) 
    attack(target){
        target.res -= this.power;
    }
}

// change the unit stats(res/power)
class Effect extends Card{
    constructor(name,cost,magnitude,text,stat){
        super(name,cost);
        this.magnitude= magnitude;
        this.stat= stat;
        this.text = text;
    }

    play(target){
        // is the target is a unit?
        if(target instanceof Unit){
            if(this.stat === "res"){
                target.res +=  this.magnitude;
                this.magnitude>0 ? console.log( target.name+",you have increased in res by" + this.magnitude)
                :console.log( target.name+" , you have decreased in res by " + this.magnitude);
                
            }else if(this.stat === "power"){
                target.power += this.magnitude;
                 this.magnitude>0 ? console.log( target.name+",you have increased in power by" + this.magnitude)
                :console.log( target.name+",you have decreased in power by" + this.magnitude);
            }
        }else{
            throw new Error("target must be unit!");
        }

    }
}

const red_belt = new Unit("Red Belt Ninja", 3,3,4);
const black_belt = new Unit("black Belt Ninja", 4,5,4);

const Hard_algo = new Effect("hard Algorithem", 2 , 3,"increase target's resilience by 3","res");
const unhand_prom = new Effect("Unhandled Promise Rejection", 1, -2,"reduce target's resilience by 2","res");
const pair = new Effect("Pair programming", 3, 2,"increase target's power by 2","power");


console.log( " your res before  "+ red_belt.res);
Hard_algo.play(red_belt);
console.log("your res after " + red_belt.res);

console.log("-------------");


console.log( " your res before  "+ red_belt.res);
unhand_prom.play(red_belt);
console.log("your res after " + red_belt.res);

console.log("-------------");

console.log( " your power before  "+ red_belt.power);
pair.play(red_belt);
console.log("your power after " + red_belt.power);

console.log("-------------");

console.log( " his res before  "+ black_belt.res);
red_belt.attack(black_belt);
console.log("his res after " + black_belt.res);
