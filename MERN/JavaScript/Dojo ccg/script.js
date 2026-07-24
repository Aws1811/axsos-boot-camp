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
    constructor(name,cost,magnitude,stat){
        super(name,cost);
        this.magnitude= magnitude;
        this.stat= stat;
    }

    play(target){
        // is the target is a unit?
        if(target instanceof Unit){
            // we use this here cuz it is an array
            if(target.stat === "res"){
                target.res +=  this.magnitude;
            }else if(target.stat === "power"){
                target.power += this.magnitude;
            }
        }else{
            throw new Error("target must be unit!");
        }

    }
}


// const ninja = new Unit("Red Belt Ninja", 3, 3, 4); // 3 power, 4 res
// const hardAlgorithm = new Effect("Hard Algorithm", 2, 3, "res"); // +3 to res

// hardAlgorithm.play(ninja);
// console.log(ninja.res); // 7 ✅ (4 + 3)

// const attacker = new Unit("Enemy", 1, 2, 5);
// attacker.attack(ninja);
// console.log(ninja.res); // 5 ✅ (7 - 2)


const ninja = new Unit("jalil",9,7,4);
const chaker = new Effect("chacler",10,19,"res");
chaker.play(ninja);
console.log(ninja);

const murad = new Unit("murad",20,20,10);
murad.attack(ninja);
console.log(ninja);