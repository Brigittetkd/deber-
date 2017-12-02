/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarot;

import java.util.Scanner;
public class Tarot {
 public static void main(String[] args) {
 Scanner leer=new Scanner(System.in);
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        int a,mm,dd,tarot,n1,n2,n3,n4;
        do{
        System.out.println("INGRESE EL AÑO:(hasta 2020): ");
        a=leer.nextInt();}
        while (a<1970 || a>2020);
        do{
        System.out.println("INGRESE EL MES:(hasta 12): ");
        mm=leer.nextInt();}
        while (mm<1 || mm>12);
        do{
            System.out.println("INGRESE EL DIA: (hasta 31): ");
            dd=leer.nextInt();}
        while (dd<1 || dd>31);
        n1=0; n2=0; n3=0; n4=0;
        tarot=a+mm+dd;
        n1=tarot/1000;
        tarot=tarot%1000;
        if (tarot>=100);{
        n2=tarot/100;
        tarot=tarot%100;}
        if (tarot>=10);{
        n3=tarot/10;
        tarot=tarot%10;}
        n4=tarot;
        tarot=n1+n2+n3+n4;
        if (tarot>=10);{
        n1=tarot/10;
        tarot=tarot%10;
        n2=tarot;
        tarot=n1+n2;}
        if (tarot>=10 && tarot<=10)
        {tarot=1;}
        System.out.println("EL NUMERO DE SU TAROT MAS SIGNIFICADO ES:..");        
        if(tarot==1)
        {System.out.println("°1° uno:|| Es independiente, signo creativo y original, autosuficiente. Por naturaleza es agresivo e individualista || ");
            System.out.println("Son líderes con voz y cetro de mando tienen capacidad y habilidad para ello. Suelen ser ambiciosos y arriesgan con tal de tener éxito y conseguir la cima. ");
            System.out.println("Son excesivamente egocéntricos,a impulsivos, firmes y muy obstinados y prepotentes.");
            System.out.println("Les cuesta hablar o demostrar sus sentimientos, son personas algo aisladas e introvertidas pero eso sí muy amables.\n" +"El uno, el padre interno, la voluntad, el poder divino la unidad.");}
            if (tarot==2)
            {System.out.println("°2° dos:|| La madre y el amor divino y las ciencias ocultas. ||");
                    System.out.println("Gran sensibilidad, intuitivo y vulnerable, le gusta el trabajo en equipo. Representa las características internas femeninas, puede dar y recibir, ");
                    System.out.println("Es la dualidad, los sentimientos ocultos y profundos. Necesita la aprobación de los demás en todo lo que hace, duda de sus capacidades, define la autoestima");
                    System.out.println("Tiene poder absoluto, inteligencia y es estratega en todo lo que piensa. Aparenta en ocasiones lo que no es, ");
                    System.out.println("Si encuentran la pareja adecuada pueden vivir y hacer vivir una gran historia de amor romántico durante muchos años.");}
                if (tarot==3)
                {System.out.println("°3° tres:|| Pensamiento creativo, jovialidad, evoluciona con optimismo, desarrollo de su talento creativo y su expresividad||");
                        System.out.println("Este número representa el niño interior que llevamos dentro , se manifiesta a través de nuestra expresión personal. Pueden ser");
                        System.out.println("amantes divertidos. La imagen es importante para ellos, les gusta aparentar y son amantes de lo material, les gusta la opulencia.");
                        System.out.println("y generar las ideas más importantes que pueden llegar a ser claves en las esferas del pensamiento, las instituciones o las empresas, ");
                        System.out.println("La humildad en su vida cotidiana no siempre está presente, su orgullo en ocasiones les hace ser prepotentes.\n");}
                    if (tarot==4)
                    {System.out.println("°4° cuatro:|| Fuerte sentido del orden y los valores.Lo íntimo, ser real, mando éxito y misericordia.. También es símbolo de la creación, de la lucha contra los||");
                            System.out.println("límites.El trabajador nato, la estabilidad, el que todo lo razona, Amante de la ley y el orden. Les gusta ser muy concretos, son rápidos y muy disciplinados, son resistentes y con una gran capacidad analítica..");
                            System.out.println("Es el ejemplo y motor del cualquier trabajo o empresa. Don de mando y ejecutador de órdenes si le vienen de un superior sin cuestionarlas. ");
                            System.out.println("Algo agresivo, impulsivo e inconsciente cuando no comparten su opinión. Impaciente si alguien le cuestiona su verdad, se cree siempre en posesión de la misma. En el amor inseguridad.");
                            System.out.println(",lento a la hora de actuar, demasiado serio y en ocasiones confuso.");}
                        if (tarot==5)
                        {System.out.println("°5° cinco:|| Ley Divina, karma, Marte, guerrero.||");
                                System.out.println("Simboliza la acción e inquietud. Es espíritu libertario, viajero y aventurero, es inconsciente y abusa de los sentidos. ");
                                System.out.println("Pensamientos rápidos y polifacéticos, es curioso expansivo y sociable. Utiliza la libertar de forma constructiva.Es muy inquieto a veces e insatisfecho, las decisiones las toma precipitadamente, es impaciente.");
                                System.out.println("Es un número de fortuna y magia, son personas que les atrae lo desconocido, los misterios, las cosas extrañas.");}
                            if (tarot==6)
                            {System.out.println("°6°seis:Buscan la perfección en los detalles, aman todo lo armonioso y bello, buscan la realización en la rutina en su vida  || ||");
                                    System.out.println("cotidiana, si nada altera sus hábitos se sienten seguros y estables. Se dan a los demás mediante una compensación equitativa.");
                                    System.out.println(" Aceptan el trabajo con dignidad y su salud dependerá de lo realizado que se sienta en lo laboral. No les gusta las complicaciones y les desestabilizan los cambios y lo desconocido,");
                                    System.out.println(" por ello es un número al cual trabajar de funcionario le da tranquilidad.\n" +
"El alma, suerte, indecisión, la inseguridad, el miedo.");}
                                if (tarot==7)
                                {System.out.println("°7° siete: ||Es un número de pensamiento, espiritual, analítico y sabio, intelectual e idealista y represivo. ||");
                                        System.out.println("Aman la lectura los estudios y tienen el afán constante de aprender. Son hábiles en la investigación, inteligentes activos y contagian su idealismo.. ");
                                        System.out.println("Capacidad inventiva, con grandes aptitudes de análisis. Es una persona que media socialmente líder entre sus compañeros o familia, don de gente, amante de la soledad y la paz y muy perfeccionista.");
                                        System.out.println("Su parte negativa es muy reservada, es encantadora en sarcasmos y silencios cuando cuando no les gusta lo que está escuchando, tiene tendencia a aislarse y se vuelve inflexible molestándole cualquier distracción.");
                                        System.out.println("Triunfos pero combatiendo guerras, luchas sufrimiento y amarguras.");}
                                    if (tarot==8)
                                    {System.out.println("°8° ocho: || Número que marca la paciencia. El número de Job, pruebas, dolor, justicia.||");
                                            System.out.println("Rigen la vida del ocho, la evolución, el equilibrio el poder. Es muy potente y emana energía con fortaleza, es vigoroso y seguro.");
                                            System.out.println(" Tiene capacidad absoluta para conseguir logros y éxitos materiales, suelo ser violento y ofuscado y apasionado en lo que hace controlando siempre sus impulsos y la situación.");
                                            System.out.println(" Es una persona muy organizada y equilibra sus fuerzas consiguiendo sus objetivos.");}
                                        if (tarot==9)
                                        {System.out.println("°9° nueve: || Sufrir soledad. El sexo, trasmutación sexual, la novena esfera.  ||\n"+
                                                "El genio, el artista, el humano, romántico y emotivamente sentimental. Animosos, agradables, amistosos y  ");
                                                System.out.println("simpáticos son desinteresados pero interesados en hacer bien su trabajo,Capacidad de empuje, es persistente y muy generoso con los demás. ");
                                                System.out.println("Trabaja en sus proyectos hasta la cima con pasión y constancia.");
                                                System.out.println("Es creído y lo sabe, suele ser algo posesivo, no controla su dinero y necesita ser el centro de atención.");}
        TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        }   
    }

    
