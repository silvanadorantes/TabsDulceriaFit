package com.example.silvanadorantes.tabsdulceriafit;

import java.util.Arrays;
import java.util.List;

/**
 * Created by silvana on 05/07/16.
 */
public class DulcesFit {
    private int id;
    private String nombre;
    private String descripcion;
    private int tipo;
    private int idImagen;

    public DulcesFit(){

    }

    public DulcesFit(int id, String nombre,  String descripcion, int tipo, int idImagen ){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.idImagen = idImagen;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    private static DulcesFit[] galleta = {
            new DulcesFit(0,"Galletas de Frutos Secos", "Estas deliciosas galletas estan hechas de " +
                    "harina de almendras decoradas con nueces y avellanas, estan endulzadas con stevia" +
                    "son ideales para esos antojos entrecomidas y para consumir antes de entrenar", 1, R.drawable.cookies),

            new DulcesFit(1,"Galletas de Almendras", "Estas deliciosas galletas estan hechas de " +
                    "harina de almendras, endulzadas con stevia, son libres de gluten" +
                    "son ideales para las meriendas y para consumir antes de entrenar", 1, R.drawable.cookies2),

            new DulcesFit(2,"Galletas Queen", "Espectaculares galletas hechas de " +
                    "harina de avena decoradas con una deliciosa mermelada de frutos rojos, estan endulzadas con stevia", 1, R.drawable.galletasconmermelada),

            new DulcesFit(3,"Galletas de Auyama y Banana", "Deliciosas galletas  hechas con " +
                    " avena en hojuelas, pure de auyama y pure de banana, estan endulzadas con miel" +
                    "son ideales para consumir antes de entrenar", 1, R.drawable.galletasdeauyamaybanano),

            new DulcesFit(4,"Galletas de Avena, Almendras y Pasas", "Estas divinas galletas son lo maximo para " +
                    "consumir antes de entrenar porque aporta una gran carga energetica al cuerpo, estan hechas " +
                    "de harina de avena, pasas y almendras, estan endulzadas con stevia", 1, R.drawable.galletasdeavena),

            new DulcesFit(5,"Galletas de Avena Light", "Esta es una versión light de las galletas de avena," +
                    " son muy ricas, puedes acompañarlas con leche de almendras, ideales para la merienda de " +
                    "los niños o para ti, si estás en mantenimiento puedes comer 2-3 en la mañana" +
                    "Estan hechas con avena en hojuelas y endulzadas con stevia, tambien puedes usar sucralosa " +
                    "para endulzarlas", 1, R.drawable.galletasdeavenalight),

            new DulcesFit(6,"Galletas de Chocolate y Nuez ", "Esta combinación de chocolate y nuez en una galleta " +
                    "es una excelente opción para las meriendas pre y postentrenamiento, o simplemente para matar la " +
                    "ansiedad. En lugar de estar hechas de harina, estas galletas se preparan con " +
                    "proteína lactosérica (Whey Protein), la cual contiene una gran cantidad de aminoácidos" +
                    " esenciales, tiene un importante valor biológico y también ayuda a regenerar masa muscular, " +
                    "a acelerar el metabolismo y a controlar el apetito. Además, utilizar la proteína lactosérica en " +
                    "lugar de la harina común, permite bajar considerablemente la cantidad de carbohidratos de las" +
                    " preparaciones", 1, R.drawable.galletasdechocolate),

            new DulcesFit(7,"Galletas de Melocoton ", "Estas divinas galletas son una convinacion deliciosa de avena en" +
                    "hojuelas, harina de avena, harina de coco, fecula de maiz, polvo de hornear, huevos, sal, aceite de coco, " +
                    "canela, vainilla, miel y el ingrediente estrella el melocoton, son super ideales para las meriendas " +
                    "preentrenamiento", 1, R.drawable.galletasdemelocoton1),

            new DulcesFit(8,"Galletas de Chocolocas ", "Estas galletas son una alucinación!, son una excelente opción para " +
                    "las meriendas y además son ideales para esos episodios en los que el chocolate más que un antojo es una" +
                    " necesidad. Estan hechas de harina de alemendras, chocolate en trocitos, Whey Protein de vainilla, stevia, huevos," +
                    "banana, mantequilla de mani natural y polvo para hornear ", 1, R.drawable.galletassaludables),




    };

    private static DulcesFit[] panquecas = {
            new DulcesFit(0,"Panquecas Proteicas de coco", "Es libre de gluten por que estan hechas de harina de coco, " +
                    "alto en proteína por las claras de huevos y el whey protein de vainilla , bajo en carbohidratos y" +
                    " libre de azúcar estan endulzadas con stevia. Las Panquecas proteicas de coco son bajas en carbohidratos" +
                    " para poder acompañarlas con frutas (1 taza de fresas) ¡Éstas podrías cenarlas! (Sin la fruta)", 2, R.drawable.panquecasproteicasdecoco),

            new DulcesFit(1,"Panquecas Free Gluten", "¡Estas panquecas Gluten Free son fáciles, económicas, muy sanas y ricas! estan hechas a bas de banana," +
                    " canela, linaza, huevo y stevia", 2, R.drawable.panquecasglutenfree),

            new DulcesFit(2,"Panquecas de Zanahoria", "Esta receta es deliciosa, las panquecas de zanahoria quedan super suavecitas, " +
                    "es para que la coman en la mañana, no de cena estan hecha con harina de avena, zanahoria, huevo, linaza, canela," +
                    "stevia, leche de almendras o agua", 2, R.drawable.panquecasdezanahoria),

            new DulcesFit(3,"Panquecas de Cacao con Topping de banana", "Espectaculares panquecas hechas con harina de avena, huevo, vainilla" +
                    "canela, leche de almendras stevia y cacao en polvo.Para hacer el topping corta en trozos la banana y espolvoréalos con " +
                    "canela y un poquito de stevia  Pásalos hasta que se doren por un sartén con un poquito de spray, aceite de coco " +
                    " (solo media cucharadita, para que no se peguen) ", 2, R.drawable.panquecasdecacaocontoppingdebanana1),

            new DulcesFit(4,"Panquecas de Auyama y Almendras", "Estas panquecas de auyama y almendras son el desayuno ideal, pues aportan " +
                    "mucha proteína y pocas calorías. Puedes acompañarlas con frutas, miel o mermelada de frutas sin azúcar." +
                    " Estas panquecas son la combinación perfecta de macronutrientes que debes incluir en cada comida: proteína + carbohidratos + grasas buena." +
                    "Si quieres comerlas en la cena, sustituye la avena por 1 medida de Whey Protein sabor a vainilla, con 1 cda. de linaza.", 2, R.drawable.panquecasdeauyamayalmendras),

            new DulcesFit(5,"Panquecas Black y White", "Estas panquecas son altas en carbohidratos y bajas en grasas, ideales para quienes " +
                    "practican un deporte de alto rendimiento. Tienen harina de avena, cambur, huevo, vainilla, linaza, canela, stevia o sucralosa" +
                    "agua, y caco en polvo", 2, R.drawable.panquecasblackandwhite),

            new DulcesFit(6,"Panquecas de Banano y Frutos Rojos ", "Estas panquecas son una combinación de banano maduro, claras de huevo " +
                    "leche de almendras, vainilla, harina de avena, fecula de maiz, polvo para hornear, sal, canela en polco y stevia " +
                    "acompaña con los frutos rojos y miel al gusto. Son idelaes para el desayuno " , 2, R.drawable.panquecasconfrutas),

            new DulcesFit(7,"Panquecas de auyama ", "La auyama es baja en calorías, alta en potasio y antioxidantes, ideal para mantenerte en forma." +
                    "la auyama es un vegetal super versátil, aporta muchísimos beneficios al organismo, es rico en vitaminas y minerales, de carga glucémica baja " +
                    "¡por lo que puedes comerlo a cualquier hora del día!, estas riquismas panquecas son hechas a base deharina de coco, claras de huevos, linaza molida," +
                    "canela en polvo, stevia y pure de auyama", 2, R.drawable.panquecasdeauyama),

            new DulcesFit(8,"Panquecas y Sirope de Chocolate Light ", "¡Estas panquecas de chocolate son increibles! contienen avena en hojuelas, clara de huevos, agua, " +
                    "vainilla, stevia y cacao en polvo que es super saludable, contiene sólo 12 Calorías por cucharada, es una fuente importante de antioxidantes, " +
                    "disminuye presión arterial, mejora la sensibilidad a la insulina, eleva serotonina y mejora estado de ánimo, disminuye ansiedad y mejora nivel de" +
                    " energía. Para hacer el sirope de chocolate, sólo tienes que añadir dos cucharadas a un vaso de leche de almendras. Este sirope es bajo en calorías " +
                    "y carbohidratos, puedes agregarlo a lo que gustes  ", 2, R.drawable.panquecassiropedechocolatelight),




    };

    private static DulcesFit[] tortas = {
            new DulcesFit(0,"Pumpkin Pie Light", "el Pumpkin pie light o pastel de calabaza es divino,y es bien ligero.Para la concha o crust del pie se usa harina de avellana o almendras" +
                    "mantequilla de almendras o avellanas, aceite de coco y stevia. Para el relleno del pie se usa auyama cocida (hornéala, busca una que tenga el color bien intenso, " +
                    "mientras más anaranjado mejor, si está amarilla pálida no sirve), huevos, canela, vainilla, leche de almendras y stevia granulada  ", 3, R.drawable.pumpkinpielight ),


            new DulcesFit(1,"Torta de Brownie", "Deliciosa torta de brownie ideal para las meriendas entrecomidas y para consumir pre y post entrenamiento." +
                    "mantequilla de almendras,harina de almendras, huevos, agua potable, vainilla, aceite de canola, polvo para hornear, cacao en polvo " +
                    "sin azucar chocolate oscuro sin azucar derretido y stevia. Para el relleno del pie se usa auyama cocida (hornéala, busca una que tenga el color bien intenso, " +
                    "mientras más anaranjado mejor, si está amarilla pálida no sirve), huevos, canela, vainilla, leche de almendras y stevia granulada  ", 3, R.drawable.tortabrownie ),

            new DulcesFit(2,"Torta Humeda", "Esta es una torta super deliciosa, húmeda, suave y saludable. Gran parte de la textura y humedad la aporta el aceite de coco," +
                    " esta grasa es una grasa saturada buena, está compuesta por ácidos grasos de cadena media que no se acumulan sino que se sigan como fuente de energía, " +
                    "se metabolizan diferente a otras grasas; van directamente al hígado desde el tracto digestivo, donde se utilizan como fuente de energía rápida o se convierten " +
                    "en cuerpos cetónicos, estos tener efectos terapéuticos sobre trastornos cerebrales como la epilepsia y Alzheimer y ayudan notablemente a disminuir el apetito…" +
                    "Además tiene múltiples propiedades, es una fuente elevada de ácido Laurico, después de la leche materna es una de las mayores fuentes; tiene propiedades antibacteriales," +
                    " acelera el metabolismo, baja colesterol y triglicéridos. Esta torta también es una buena fuente de fibra y potasio por la banana, las harinas utilizadas son altas en fibra" +
                    " y de baja carga glucémica, es libre de azúcar, ¡es riquísima y muy saludable! Pero no es como para incluirla en un régimen de pérdida de grasa, a menos de que sea una vez a la semana." +
                    " Este postre es más como para quienes están en mantenimiento o aumento de masa muscular. ", 3, R.drawable.tortahumeda ),

            new DulcesFit(3,"Torta de Manzana y Nuez", "Esta torta es una buena opción para sustituir un postre cuando buscas mantener tu peso, puedes merendar un pedacito o consumirlo en el desayuno." +
                    "esta hecha a base de harina de almendras y de coco, polvo para hornear, huevo, canela, vainilla, aceite de coco, nueces, manzana, compota de manzana y stevia ", 3, R.drawable.tortademanzanaynuez ),

            new DulcesFit(4,"Torta de Chocolate sin harina", "Esta torta de chocolate sin harinas es libre de gluten, sin azúcar, relativamente baja en carbos y ¡demasiado rica!,¡Mata tu antojo de vez en cuando con " +
                    "este tipo de recetas pero sin abusar! Igual tiene calorías. sus ingredientes son huevos, vainilla, mantequilla de mani, polvo para hornear, cacao en polvo, stevia, chocolate oscuro sin azucar", 3, R.drawable.tortadechocolatesinharina1 ),


            new DulcesFit(5,"Ponque de Zanahoria", "Este ponqué de zanahoria es una maravilla!, es superdelicioso y muy nutritivo, perfecto para merendar en familia." +
                    " La zanahoria ayuda a quitarse unos años de encima, pues es rica en betacaroteno, que es un antioxidante que ayuda a detener el envejecimiento de" +
                    " las células. Además, mejora la vista, previene el cáncer de mama, de colon y de pulmón, mejora la salud cardiovascular y embellece la piel" +
                    "sus ingredientes son huevos, aceite de coco, vainilla, stevia granulado, canela, harina de almendras y de avena, polvo para hornear y zanahoria", 3, R.drawable.muffinszanahoria ),

            new DulcesFit(6,"Pie de Frutos Secos, Chocolate y Mermelada", "Este Pie es fabuloso, el crust esta hecho a base de mantequilla de frutos secos(Almendra,avellana,mani)," +
                    "harina de frutos secos(Almendra,avellana,mani), aceite de coco y stevia para el relleno crema de cacao y avellanas y memerlada natural con stevia ", 3, R.drawable.piedefrutossecoschocolateymermelada ),


            new DulcesFit(7,"Brownies a Base de Cacao", "Estos son unos brownies a base de cacao, son muy sanos.Estan hechos con mantequilla de mani, stevia, huevos, vainilla" +
                    "cacao en polvo, harina de almendras, polvo para hornear, leche de almendras. Este postre es muy saludable, créanme que no hay " +
                    "ningún tipo de sacrificio en cuanto al sabor y ganan muchísimos beneficios con estos ingredientes.  ", 3, R.drawable.browniesabasedecacao ),


            new DulcesFit(8,"Cheesecake Vegano Fit", "¡Esta receta de cheesecake creo que es la tapa del frasco! Es una receta vegana, ¡no lleva huevo, lácteos ni azúcar! Y está " +
                    "demasiado buena. No tiene nada que envidiarle a la receta full plomo, ¡se los juro!. El crust esta hecho a base de mani molido, harina de almendras, mantequilla de" +
                    "mani, coco rallado, sal marina, stevia. Para el relleno merey, jugo de limon, aceite de coco y stevia granulado ", 3, R.drawable.cheesecakeveganofit ),


    };

    //Obtiene la lista de las galletas
    public static List<DulcesFit> getGalleta(){
        return Arrays.asList(galleta);
    }

    //Obtiene una Galleta basado en la posicion del Array
    public static DulcesFit getGalletasByPosition(int position){
        return galleta[position];
    }

    //Obtiene la lista de las Panquecas
    public static List<DulcesFit> getPanquecas(){
        return Arrays.asList(panquecas);
    }

    //Obtiene una Panquecas basado en la posicion del Array
    public static DulcesFit getPanquecasByPosition(int position){
        return panquecas[position];
    }

    //Obtiene la lista de las Tortas
    public static List<DulcesFit> getTortas(){
        return Arrays.asList(tortas);
    }

    //Obtiene una Torta basado en la posicion del Array
    public static DulcesFit getTortaByPosition(int position){
        return tortas[position];
    }




}
