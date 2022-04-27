
class Range {
		static void main(String[] args) {
		   def rchar = 'a'..'x';
		   def rint = 1..10;
			 
		   println(rint.contains(3));
		   println(rint.contains(11));
		   println(rint.contains(10));
		   println(rchar.contains('p'));
		   println(rchar.contains('y'));
		   println(rint.size());
		   println(rchar.size());
		   println(rint.get(2))
		   println(rint.getFrom());
		   println(rint.getTo());
		   println(rint.isReverse());
		   println(rint.subList(1,4));
		   println(rint.subList(4,8));
		}
	 }
