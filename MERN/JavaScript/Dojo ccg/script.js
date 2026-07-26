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
                this.magnitude>0 ? console.log("you have increased in res by" + this.magnitude)
                :console.log("you have decreased in res by" + this.magnitude);
                
            }else if(this.stat === "power"){
                target.power += this.magnitude;
                 this.magnitude>0 ? console.log("you have increased in power by" + this.magnitude)
                :console.log("you have decreased in power by" + this.magnitude);
            }
        }else{
            throw new Error("target must be unit!");
        }

    }
}