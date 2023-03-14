import java.util.HashMap;


public class sadacha3 {
    public static void main(String[] args) {

        System.out.println("Частота слов в предложении.");

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

       // String sentence = "Это Это простое простое простое предложение.";

        // Algoritm
        // Polychit' otvet v vide pari:
        // (Slovo(word-String) +"vstretilos v texte" +kolichestvo ras(frequencies-Integer))
        // V HashMap bydem klast slovo i ego chastoty
        // Predlochenie mochno podelit na slova metodom split po rasdelitely " "
        // chastota poiyvleniya slova poshitaem ciklom for po kol-vy slov
        // v cikle proveriem vstretilos li slovo, esli da to chastoty ++
        // chastota nychna dly kachdogo slova
        // chastoti zanesem v massiv frequenci[i]

        // itog: v HashMap polochim word[i],frequenci[i]

        String[] s = sentence.toLowerCase().split(" "); // massiv dliy slov
        int w =s.length;
        System.out.println("Количество слов в предложении: " + w);

        int [] frequency = new int[w];
        for (int i = 0; i <s.length ; i++) {        // pereberaet vse slova
            for (int j = 0; j < s.length; j++) {            // sravnivaet s pervim
                if (s[i].equals(s[j])){             // esli slovo iz predlocheniya nachlos sredi vsech v etom predlo
                    frequency[i]++;
                }
            }
        }
        HashMap<String, Integer> wordsFrequency = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            wordsFrequency.put(s[i], frequency[i]);
        }
        for (String i : wordsFrequency.keySet()) {
            System.out.println("Слово: " + i + " | Количество повторов: " + wordsFrequency.get(i));
        }







        System.out.println("Дано предложение: " + sentence);






    }
}

