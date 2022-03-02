package euan.lorenzo.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas:ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter=AdaptadorMovies(this, peliculas)
        var listView: ListView=findViewById(R.id.listv)
        listView.adapter=adapter
    }
    fun llenar_peliculas(){
        val pelicula1= Pelicula(1,"Toy Story", "Toy Story is about the &#39;secret life of toys&#39; when people are not around. When Buzz\n" +
                "Lightyear, a space-ranger, takes Woody&#39;s place as Andy&#39;s favorite toy, Woody doesn&#39;t like\n" +
                "the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and\n" +
                "Woody is accused by all the other toys of having killed him. He has to go out of the house\n" +
                "to look for him so that they can both return to Andys room. But while on the outside they\n" +
                "get into all kind of trouble while trying to get home.",
        120,R.drawable.toystory)
        peliculas.add(pelicula1)

        val pelicula2= Pelicula(2,"Men in Black", "Based off of the comic book. Unbeknownst to other people, there is a private agency code\n" +
                "named MiB. This agency is some kind of extra terrestrial surveillance corporation. Then,\n" +
                "one of the agency&#39;s finest men only going by the name &quot;K&quot; (Tommy Lee Jones) , is\n" +
                "recruiting for a new addition to the agency. He has chosen James Edwards (Will Smith) of\n" +
                "the N.Y.P.D. Then, one day, a flying saucer crashes into Earth. This was an alien a part of\n" +
                "the &quot;Bug&quot; race. He takes the body of a farmer (Vincent D&#39;Onofrio) and heads to New York.\n" +
                "He is searching for a super energy source called &quot;The Galaxy&quot;. Now, Agents J and K must\n" +
                "stop the bug before it can escape with the galaxy.",
            120,R.drawable.mib)
        peliculas.add(pelicula2)

        val pelicula3= Pelicula(3,"Leap Year", "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish\n" +
                "tradition which occurs every time the date February 29 rolls around, faces a major setback\n" +
                "when bad weather threatens to derail her planned trip to Dublin. With the help of an\n" +
                "innkeeper, however, her cross-country odyssey just might result in her getting engaged.",
            120,R.drawable.leapyear)
        peliculas.add(pelicula3)

        val pelicula4= Pelicula(4,"Inception", "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing\n" +
                "valuable secrets from deep within the subconscious during the dream state, when the\n" +
                "mind is at its most vulnerable. Cobb&#39;s rare ability has made him a coveted player in this\n" +
                "treacherous new world of corporate espionage, but it has also made him an international\n" +
                "fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at\n" +
                "redemption. One last job could give him his life back but only if he can accomplish the\n" +
                "impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to\n" +
                "pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it\n" +
                "could be the perfect crime. But no amount of careful planning or expertise can prepare the\n" +
                "team for the dangerous enemy that seems to predict their every move. An enemy that only\n" +
                "Cobb could have seen coming.",
            120,R.drawable.inception)
        peliculas.add(pelicula4)

        val pelicula5= Pelicula(5,"Suits", "While running from a drug deal gone bad, brilliant young college dropout Mike Ross slips into a job\n" +
                "interview with one of New York City&#39;s best legal closers, Harvey Specter. Tired of cookie-cutter law-\n" +
                "school grads, Harvey takes a gamble by hiring Mike on the spot after recognizing his raw talent and\n" +
                "photographic memory. Mike and Harvey are a winning team. Although Mike is a genius, he still has\n" +
                "a lot to learn about law; and while Harvey might seem like an emotionless, cold-blooded shark,\n" +
                "Mike&#39;s sympathy and concern for their cases and clients will help remind Harvey why he went into\n" +
                "law in the first place. Mike&#39;s other allies in the office include the firm&#39;s best paralegal Rachel and\n" +
                "Harvey&#39;s no-nonsense assistant Donna. Proving to be an irrepressible duo and invaluable to the\n" +
                "practice, Mike and Harvey must keep their secret from everyone including managing partner\n" +
                "Jessica and Harvey&#39;s archnemesis Louis, who seems intent on making Mike&#39;s life as difficult as\n" +
                "possible.",
            120,R.drawable.suits)
        peliculas.add(pelicula5)
    }
}