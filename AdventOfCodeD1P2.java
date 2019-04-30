//http://adventofcode.com/2017/day/1

public class AdventOfCodeD1P2 {

	public static void main(String[] args) {
		String num = "6497139596828982595777779823495157848226849399661913591643699334353664"
				+ "3184775448866196536355798516621935871473931837138238829615119536157121613"
				+ "1925158492441461844687324923315381358331571577613789649166486152237945917"
				+ "9879777938917398651497347559932413618863369265384822711247553595727914513"
				+ "3584253489319269355865999117198384928548913942142593363861488441589693891"
				+ "4992732492192458636484523228244532331587584779552788544667253577324649915"
				+ "2741159246117583456761834439829927339663734983856859657689292414779837279"
				+ "2127982672797687255631542843479916175973493265982993456233938532811965682"
				+ "3483954856427365892627728163524721467938449943358192632262354854593635831"
				+ "5593522474439759451441631835637235628913578593679641262894459821355235359"
				+ "2311358931641762348363163756929194178299221388951371452534246856334938527"
				+ "1884221685549996534333765731243895662624829924982971685443825366827923589"
				+ "4352545142114896494823748764345496827854596988855216732589394132551581965"
				+ "2569623645791144759994744966554255425148684738882357693716723747655678213"
				+ "3227279324526834946534444718161524129285919477959937684728882592779941734"
				+ "1861441388839943227424848539253835186516871472469434213112873248676636984"
				+ "3254661958363897663773334525183486998574638537161774349862711144193354635"
				+ "6934671639545342515392536574744795732243617113574641284231928489312683617"
				+ "1545366482192449964917457186581516482467918264669736547652842639288841378"
				+ "6364762323734588246914293314263758364425842741697259524173725444971853172"
				+ "4176538648369253796688931245191382956961544775856872281317743828552629843"
				+ "5518449279131475183773622665543343867213132442232333964532912249324992779"
				+ "6152578575586385248714194662666383519528676294717238418666743951636721939"
				+ "1823774338692151926472717373235612911848773387771244144969149482477519437"
				+ "8228634226621574619684442819723531496955154949925379274921113881938375538"
				+ "4467171929148244233776132127233398292428932343727722456514992841625543584"
				+ "1327756139118119744528993269157174414264387573331116323982614862952264597"
				+ "6118859992859955163575196486955942996573876147933416263188665191445745718"
				+ "1653535114939473591697544842561817157291719516559432355219934681472961718"
				+ "9679698944337146";
		
		int sum = 0;
		int count = num.length()/2;
		
		for(int i = 0; i < num.length()/2; i++) {
			if(num.substring(i,i+1).equals(num.substring(count+i, count+i+1))){
				Integer toNum = Integer.parseInt(num.substring(i,i+1));
				sum += toNum*2;
			}
		}
		
		System.out.println(sum);
		
	}

}
