package com.example.android.storyteller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<story> stories = new ArrayList<story>();
        stories.add(new story("Christofer And The Aliens", R.drawable.christoferaliens, "Refernce : english-for-students.com", "It was a dark and stormy night. The whole of Greentown was covered by dark clouds. Christopher was returning home. It started raining cats and dogs.\n" +
                "\n" +
                "Suddenly he saw a U.F.O. appearing from the clouds above. In no time it landed on the road. Three aliens came out. Chris was astonished as he could understand their language. Their plan was to take all the trees away from earth. Not wasting a moment, Chris called his friends. Those aliens pointed out to a tree. An eerie blue light shot out from their hands making a tree vanish. Soon, Chris’s friends arrived. They tried to scare those aliens by throwing stones, but in vain.\n" +
                "\n" +
                "Luckily, Mr. Goon, the fat inspector of the area arrived. With a frightened look on his face, he shot at those aliens. One of them pointed his finger at Mr. Goon. To everyone’s amazement, Mr. Goon became as thin as a stick. Everybody laughed. Suddenly, Anna, Chris’s friend, ran towards them, shouting at the top of her shrill voice. Those aliens got the fright of their lives and vanished along with their spaceship. The kids were delighted. They had saved their planet. Mr. Goon was left fiddling with his pants."));


        stories.add(new story("Count The Blessings Not The Curses", R.drawable.countblessings, "Refernce : english-for-students.com", "A boy used to cry for new costly shoes.\n" +
                "\n" +
                "His father was a worker in a factory and he had a meager salary. He bought cheap shoes but the boy was disappointed.\n" +
                "\n" +
                "He cried a lot and left the house. He sat near a bus stop.\n" +
                "\n" +
                "He wondered when he would get the expensive pair. Just then a beggar passed by on his crutches. The boy was shocked to find that the beggar had no legs. He got enlightened. At least he had legs. He thanked god for giving him legs and mother and father who were so caring."));


        stories.add(new story("Home Alone", R.drawable.homealone, "Refernce : english-for-students.com", "It was a dark and stormy night.\n" +
                "\n" +
                "I was alone at home and about to go to bed, when I saw a scary shadow figure at my window.\n" +
                "\n" +
                "\"Who’s there\" I shouted.\n" +
                "\n" +
                "Suddenly there was a flash of lightning followed by thundershower.\n" +
                "\n" +
                "I saw a lion’s face followed by a scary thunderous roar at the window. It looked like the lion from the local circus that had been announced missing on the television news channel. I felt very scared. I ran to my bed and pulled my blanket over my head. I started to shout for my parents but there was no reply. Then I remembered they were at a late night party.\n" +
                "\n" +
                "I peeped out of my blanket but it was too dark to see anything. Then I heard footsteps.\n" +
                "\n" +
                "They were getting louder and louder. Soon the footsteps died off.\n" +
                "\n" +
                "The grand father clock struck 12. I went back to bed and tried to sleep, but couldn’t. I felt too frightened. I sat up my mind full of scary thoughts. After some time passed, finally I fell asleep.\n" +
                "\n" +
                "I woke up only after eight in the morning and switched on the TV news. I was excited to see the lion was already trapped in the wee hours of the morning by the ring master of the circus. I felt very much relieved after the news.\n" +
                "\n" +
                "Later I narrated the whole incident to my parents.\n" +
                "\n" +
                "They were dumb shocked and decided in future not to leave me alone at home during night."));


        stories.add(new story("A Little Friend", R.drawable.littlefriend, "Refernce : english-for-students.com", "That was a bad day for our Mr. Lion King. During his chase to catch a rabbit he sprang into a small bush from where he came out not with the rabbit but with a large thorn in his palm.\n" +
                "\n" +
                "He cried for help. He tried his best to pull out the thorn. He shook his hand, tried to pull out the thorn with his mouth etc. but all his efforts was in vain. The thorn began to smile at Mr. Lion.\n" +
                "\n" +
                "Then he asked other animals for help. But they all feared the lion. So no animals came to help him.\n" +
                "\n" +
                "At last the lion approached the clever fox. The king asked, “Can you pull out the thorn please. I am suffering very much with pain.\"\n" +
                "\n" +
                "The fox said, “I am not very expert in this task. But I have a little friend who is very expert in this work. I will surely ask him to help you. But I have some demands.\"\n" +
                "\n" +
                "“What are your demands?\" asked the king.\n" +
                "\n" +
                "“It is not just food or money Your Majesty! You should allow me to give you five kicks on your back!\" the fox said.\n" +
                "\n" +
                "The lion king asked with surprise and anger “Do you want to kick me? Don’t you know who I am?\"\n" +
                "\n" +
                "“I know! I know! But it is not my need to remove thorn from your palm. If you don’t want I am going. Good Bye\" said the fox.\n" +
                "\n" +
                "“Hey! Wait! Wait!\" said the lion and he began to think for a moment “I am suffering with the pain of the thorn. It has to be pulled out. Let him kick me five times. I just want to remove the thorn. After taking the thorn I will eat up his little friend.\"\n" +
                "\n" +
                "The fox then began to kick the Lion King with his permission. One, two, three… like that. The fox called his little friend.\n" +
                "\n" +
                "There comes a little porcupine. He pulled out the thorn with great ease. The pain in the palm of the lion was reduced. But his mind became filled with anger, grief and disappointment. What to say! He was very much disappointed in thinking how he can take revenge for the five kicks he got from the fox. How can he eat the porcupine with thousands of quills? At last he had to bow down before the great intelligence of the clever fox. "));


        stories.add(new story("A Mysterious Memory", R.drawable.mysteriousmemory, "Refernce : english-for-students.com", "Though it is one of the faded memories of my life today, there are times when I remember his face clearly, especially his eyes. As he had yellow spots on his eyes we called him spotty. He would have been a stray dog, until, he came to me.\n" +
                "\n" +
                "I was seven years old. My dad had just got transferred to Nasik. We had shifted into a rented house. The house was surrounded by lots of bushes and vines. It was raining very heavily on the day we shifted.\n" +
                "\n" +
                "I went out and felt those refreshing raindrops with a cool breeze on my face. It was a cold dark night. We had our meal and went to sleep.\n" +
                "\n" +
                "Somehow in the midnight I heard a loud thud outside the main door. I mustered courage and peeped out through the window adjoining the door and I was really amused with what I saw outside.\n" +
                "\n" +
                "There was a small puppy lying on an old rug which my mother had put outside the door. It was wet and shivering. At first it was difficult to see the little one. It had a black body which was darker even than a black rainy cloud. It was the yellow spots on its eyes, which made me realize its presence.\n" +
                "\n" +
                "It was trying to get inside the curved rug to avoid the chilling air outside and it had managed to get in as I could see only his head outside the rug.\n" +
                "\n" +
                "I saw that the flowerpot kept on the window sill had fallen down. I felt pity for poor soul. I went in and came out with an old towel. I went near the innocent one and held it in my hand and wiped the puppy till he had become dry. I took it inside and made a bed for him with a woolen rug and a small pillow. He seemed very comfortable in his new bed as he went to sleep immediately.\n" +
                "\n" +
                "The next day morning, everyone in the family came to know about the unusual guest. “Shall we keep him with us?\" I questioned my mom.\n" +
                "\n" +
                "Like any other parents would, my parents first totally refused my idea but I and my sister convinced them to keep Spotty.\n" +
                "\n" +
                "Slowly Spotty got easily mingled with everyone and became one of the family members. We got used to all his small habits and pranks.\n" +
                "\n" +
                "Days passed on and one evening when Spotty returned from his long walk, he appeared very exhausted. He came to my room and sat near me. It was then I saw that his hind leg was injured and was bleeding. I called out my mother and she quickly tied a bandage around his leg and gave him food to eat.\n" +
                "\n" +
                "I was very upset. But the next day, Spotty was up to his usual pranks though he limped a bit.\n" +
                "\n" +
                "After this incident my relation with Spotty became more intense. I really admired him a lot for his courage.\n" +
                "\n" +
                "Almost a year later, one midnight we heard Spotty barking breathlessly. We came out and saw that he was barking continuously heading somewhere.\n" +
                "\n" +
                "After some time Spotty became quite. I patted him on his back and came inside. The next day morning, my heart skipped a beat when I didn’t see Spotty. I searched for him in each and every corner but he was nowhere. And this time he had gone and would never come back. I cried and waited for him. We waited for one long week. But there were no signs of him.\n" +
                "\n" +
                "Then one day my Dad got transferred to Mumbai. We shifted back to Mumbai. What would have happened to Spotty? Would he have died? These were the only questions in my mind, but they all remained unanswered forever."));


        stories.add(new story("The Mysterious School", R.drawable.mysteriousschoole, "Refernce : english-for-students.com", "It was her first day at Cedars International School. Sheila was in the 2nd grade. She missed her old school and was quite sure that she was going to hate this new place.\n" +
                "\n" +
                "At lunch break, Junie and Pam, two girls from her class introduced themselves to her. They took her to a tree that stood at the corner of the playground.\n" +
                "\n" +
                "“Would you like to come to the Hole of Mysteries with us?\" Pam asked her.\n" +
                "\n" +
                "“Hole of Mysteries! Where’s that?\" Sheila asked astonished.\n" +
                "\n" +
                "Near the tree was a hole, covered with hay and sticks. “This is the Hole of Mysteries,\" said Junie.\n" +
                "\n" +
                "“Come on, let’s jump into the hole,\" said Pam.\n" +
                "\n" +
                "Holding each other’s hands, Pam, Sheila and Junie jumped inside. The hole became darker as they went deeper and deeper.\n" +
                "\n" +
                "Then all of a sudden it became bright. Lighted candles were everywhere. Sheila was frightened. Seeing her, Pam laughed. Junie pointed out to a rabbit lighting a candle.\n" +
                "\n" +
                "The Mysterious School\n" +
                "\n" +
                "\"That is Binkie the rabbit,\" said Pam. “She plans all our adventures.\"\n" +
                "\n" +
                "“Hi Binkie!\" said Junie. “This is Sheila, our new friend. Do you have a mysterious adventure for us today in the mysterious school?\"\n" +
                "\n" +
                "Binkie smiled and said, “Hi Sheila, welcome to the Hole of Mysteries. Sorry girls, I only have a tiny adventure for you. It’s not easy, mind you. You have to be very alert as it’s to do with sounds. Be aware of he who can talk. Now follow me. You have to find your way out.\" Binkie went ahead.\n" +
                "\n" +
                "The girls followed her. They came to a small room. Binkie had vanished. Once they got inside, the doors locked automatically. There were three animals in the room: a cat, a dog and a fish (inside a bowl). They could hear loud grunts from outside.\n" +
                "\n" +
                "“I think there’s a monster nearby,\" said Sheila, frightened.\n" +
                "\n" +
                "“We have to take the help of these animals to get out!\" whispered Junie.\n" +
                "\n" +
                "“Or else we will have to stay here for ever,\" said Pam.\n" +
                "\n" +
                "“How do we find our way out?\" asked Sheila, feeling quite nervous.\n" +
                "\n" +
                "“Let’s think hard!\" said Junie.\n" +
                "\n" +
                "“I think I know!\" said Pam. “Remember Binkie told us to be aware of ‘he who can talk’. I think one of these animals can talk.\"\n" +
                "\n" +
                "“But which one?\" asked Sheila.\n" +
                "\n" +
                "“Let’s find out,\" said Junie.\n" +
                "\n" +
                "“Did you notice what the animals were doing when we got here? The cat was shaking its head and scratching itself. The fish was waving its tail and the dog was thumping its tail. I feel it must be either the dog or the fish. Let’s find out.\"\n" +
                "\n" +
                "Pam went up to the fish and said, “Can you help us?\" The fish did not seem to have heard her and continued to wave its tail in the water.\n" +
                "\n" +
                "Then Sheila went up to the dog and said, “What’s your name?\"\n" +
                "\n" +
                "“Spike,\" replied the dog. “If you are looking for the exit, I can help you.\"\n" +
                "\n" +
                "“Can you really talk?\" the girls asked the dog.\n" +
                "\n" +
                "“Yes I can,\" said the dog. “Now press hard against the door and chant ‘Ashanti’ three times. When the door opens run fast until you reach the top. Don’t look back ever!\"\n" +
                "\n" +
                "The three thanked the dog and as soon as they chanted ‘Ashanti’ thrice, the door opened.\n" +
                "\n" +
                "But, the grunting sounds grew louder, frightening the girls.\n" +
                "\n" +
                "They ran up the dark path, stopping only when they reached up, at the beginning of the tunnel.\n" +
                "\n" +
                "“Hey, we made it!\" shouted Pam in excitement as they found back themselves in the mysterious school playground.\n" +
                "\n" +
                "“But what about the animals?\" asked Sheila.\n" +
                "\n" +
                "“They are in there, perhaps helping Binkie plan our next adventure!\"\n" +
                "\n" +
                "“Wow!\" said Sheila. “I think I’m going to have a great time at Cedars!\"\n" +
                "\n" +
                "The bell rang just then and the trio returned to their class in the mysterious school."));

        stories.add(new story("The Old Lady And The Lamp", R.drawable.oldlady, "Refernce : english-for-students.com", "Once upon a time there lived a beautiful old lady in a small hamlet.\n" +
                "\n" +
                "When the sun set the old lady lighted a lamp.\n" +
                "\n" +
                "The lamp felt very proud of itself that it was the brightest object in the universe.\n" +
                "\n" +
                "One cold windy night the lamp was blown off. It started crying.\n" +
                "\n" +
                "Then the old lady told the lamp not to be haughty.\n" +
                "\n" +
                "She again lighted the lamp. Thereafter, it was quite humble and behaved well.\n" +
                "\n" +
                "Moral: Don’t be vain."));


        stories.add(new story("The Boy Who Cried Wolf", R.drawable.theboywhocriedwolf, "Refernce : kidsworldfun.com", "Once there was a shepherd boy, who had to look after a flock of sheep. One day, he felt bored and decided to play a trick on the villagers. He shouted, “Help! Wolf! Wolf!”\n" +
                "\n" +
                "The villagers heard his cries and rushed out of the village to help the shepherd boy. When they reached him, they asked, “Where is the wolf?”\n" +
                "\n" +
                "The shepherd boy laughed loudly, “Ha, Ha, Ha! I fooled you all. I was only playing a trick on you.”\n" +
                "\n" +
                "A few days later, the shepherd boy played the trick again.\n" +
                "\n" +
                "He cried, “Help! Help! Wolf! Wolf!” Again, the villagers rushed up the hill to help him and again they found that the boy had tricked them. They were very angry with him for being so naughty.\n" +
                "\n" +
                "Then, sometime later, a wolf really went into the field. The wolf attacked one sheep, and then another and another. The shepherd boy ran towards the village shouting, “Help! Help! Wolf! Help! Somebody!”\n" +
                "\n" +
                "The villagers heard his cries but they laughed because they thought it was just another trick.\n" +
                "\n" +
                "The boy ran to the nearest villager and said, “A wolf is attacking the sheep. I lied before, but this time it is true!”\n" +
                "\n" +
                "Finally, the villagers went to look. It was true. They could see the wolf running away and many dead sheep lying on the grass.\n" +
                "\n" +
                "We may not believe someone who often tells lies, even when he tells the truth."));

        stories.add(new story("The Crystall Ball", R.drawable.crystallball, "Refernce : kidsworldfun.com", "In the south of Spain, there was a small village whose people were very joyful. The children played under the shades of trees in the gardens of their homes.\n" +
                "\n" +
                "A shepherd boy named Nasir stayed near the village with his father, mother and grandmother. Each morning, he took his herd of goats up the hills to find a suitable place for them to graze. In the afternoon he would return with them to the village. Each night his grandmother would tell him a story - the story of stars. This story really interested Nasir.\n" +
                "\n" +
                "On one of those days, as Nasir was watching his herd and playing his flute, he suddenly saw a wonderful light behind a flower bush. When he approached the bush, he saw a transparent and very beautiful crystal ball.\n" +
                "\n" +
                "The crystal ball was glittering like a colorful rainbow. Nasir carefully took it in his hand and turned it around. With surprise, suddenly, he heard a weak voice coming from the crystal ball. It said, “You can make a wish that your heart desires and I will fulfill it.”\n" +
                "\n" +
                "Nasir could not believe that he had actually heard a voice. When he made sure that he had indeed heard that voice from the crystal ball, he was very confused. He had so many wishes that he could not decide upon one particular wish. He said to himself, ‘if I wait till tomorrow I will remember many things. Then I will make my wish.’\n" +
                "\n" +
                "He put the crystal ball in a bag and, gathering the herd, happily returned to the village. He decided that he would not tell anyone about the crystal ball.\n" +
                "\n" +
                "On the following day also, Nasir could not decide what to wish for, because he really had everything he needed.\n" +
                "\n" +
                "The days passed as usual, but Nasir was still unable to make his wish. But he appeared to be very cheerful. The people around him were amazed to see the change in his disposition."));

        stories.add(new story("The Hare And The Tortoise", R.drawable.hatretortoise, "Refernce : kidsworldfun.com", "here once was a speedy Hare who bragged about how fast he could run. Tired of hearing him boast, the Tortoise challenged him to a race. All the animals in the forest gathered to watch.\n" +
                "\n" +
                "The Hare ran down the road for a while and then paused to rest. He looked back at the tortoise and cried out, \"How do you expect to win this race when you are walking along at your slow, slow pace?\"\n" +
                "\n" +
                "The Hare stretched himself out alongside the road and fell asleep, thinking, \"There is plenty of time to relax.\"\n" +
                "\n" +
                "The Hare and the Tortoise StoryThe Tortoise walked and walked, never ever stopping until he came to the finish line.\n" +
                "\n" +
                "The animals who were watching cheered so loudly for Tortoise that they woke up the Hare. The Hare stretched, yawned and began to run again, but it was too late. Tortoise had already crossed the finish line.\n" +
                "\n" +
                "Moral: Slow and steady wins the race."));

        stories.add(new story("The True Treasure", R.drawable.treasure, "Refernce : kidsworldfun.com", "Once, there was an old man who had four sons. All four of them were very lazy.\n" +
                "\n" +
                "One day, the old man fell sick and was counting his last days in bed. He worried a lot about his sons’ future as the young men hesitated a lot to work. The sons believed that luck would favour them.\n" +
                "\n" +
                "The old man’s health deteriorated every day and he decided to talk to his sons about their future. However, his sons did not listen to him.\n" +
                "\n" +
                "Finally, the old man decided to play a trick to let his sons realize the importance of work. He called all his sons and let them sit near him on his bed. He said that he had a treasure box with gold coins and expensive gems for them and wanted to share the treasure equally among the four of them.\n" +
                "\n" +
                "The young men were very happy and asked where his father had placed the treasure. The old man replied, “I cannot exactly remember the place where I have hidden the treasure. However, the treasure box is buried in our land. I’m really not sure about the place where I have hidden the treasure box.”\n" +
                "\n" +
                "Even though the lazy young sons were happy, they were sad that the old man had forgotten the place where the treasure was hidden. After a few days, the old man died. The sons decided to dig the land to find the treasure box.\n" +
                "\n" +
                "They worked very hard and dug their land. They could not find any treasure box in the land. Finally, they decided to dig a spot in their land that was a bit different from the rest of the area. The sons believed that the treasure was buried in that spot. They dug the specific spot deeply, but got nothing but water.\n" +
                "\n" +
                "A passerby who noticed the land and the water flowing from the spot talked to the sons about farming. Upon his advice, the four sons sowed vegetable seeds, and planted greens and flowering plants in their land. Since the land was very fertile with abundant water, within a few weeks, it became a fertile garden with nutritious vegetables and greens. The four sons sold the vegetables at a good price and earned a good amount of money.\n" +
                "\n" +
                "Then they realized that it was hard work that was referred to as ‘Treasure Box’ by their father. Gradually, the four sons overcame their laziness, worked hard, earned more money and lived happily.\n" +
                "\n" +
                "Hard Work Always Pays."));

        stories.add(new story("The True Wealth", R.drawable.truewealth, "Refernce : kidsworldfun.com", "Once upon a time, there lived a very rich and wealthy man in a big town. He led a luxurious life. He always boasted about his wealth to his friends and relatives.\n" +
                "\n" +
                "His son was studying in a distant city and he returned home for vacation. The rich man wanted to show off to his son how rich he was. But his son wasn’t fond of any luxurious lifestyle. However, the rich man wanted to make his son realize that his lifestyle was extremely rich and that poor people suffered a lot. He planned a day’s visit to the entire town to show him the life of the poor people.\n" +
                "\n" +
                "The father and the son took a chariot and visited the entire town. They returned home after two days. The father was happy that his son was very quiet after seeing the poor people honouring the rich man and after witnessing the sufferings of the poor due to lack of facilities.\n" +
                "\n" +
                "The rich man asked his son, “Dear boy, how was the trip? Have you enjoyed it?”\n" +
                "\n" +
                "“Yes my dad, it was a great trip with you,” the son replied.\n" +
                "\n" +
                "“So, what did you learn from the trip?” the father asked.\n" +
                "\n" +
                "The son was silent.\n" +
                "\n" +
                "“Finally you have realized how the poor suffer and how they actually live,” said the father.\n" +
                "\n" +
                "“No father,” replied the son. He added, “We have only two dogs, they have 10 dogs. We have a big pool in our garden, but they have a massive bay without any end! We have luxurious and expensive lights imported from various countries, but they have countless stars lighting their nights. We have a house on a small piece of land, but they have abundant fields that go beyond the horizon. We are protected by huge and strong walls around our property, but they bond with each other and surround themselves with their fellow beings. We have to buy food from them, but they are so rich that they can cultivate their own food.”\n" +
                "\n" +
                "The rich father was stunned and speechless, on hearing his son’s words.\n" +
                "\n" +
                "Finally the son added, “Dad, thank you so much for showing me who is rich and who is poor. Thank you for letting me understand how poor we really are!”\n" +
                "\n" +
                "True wealth is not measured by money and property! True wealth is created in good friendships and compassionate relationships."));

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new GridLayoutManager(this, 3));
        adapter = new RecyclerAdapter(MainActivity.this, stories);
        recyclerview.setAdapter(adapter);

    }
}
