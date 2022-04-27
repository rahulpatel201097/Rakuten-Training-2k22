import groovy.util.logging.Log4j2.Log4j2LoggingStrategy

class ListOperations {
		static void main(String[] args) {
		   def lst = [11, 12, 13, 14];
		   def emptylst = [];
		  def newlst = [];
			 
		  println(lst);
		   lst.add(15);
			 
		   println(lst);
		   lst.add(2,20);
			 
		   println(lst);
		  
					
		   println(lst.contains(12));
		   println(lst.contains(18));
		   
		   println(lst.get(0));
		   println(lst.get(2));
		   
		 
		   println(lst.isEmpty());
		   println(emptylst.isEmpty());
		   
		   newlst = lst.minus([12,13]);
		   println(newlst);
		   
		   newlst = lst.plus([15,16]);
		   println(newlst);
		   
		   println(lst.pop());
		   println(lst);
		   
		   println(lst.remove(2));
		   println(lst);
		   
		   def revlst = lst.reverse();
		   println(revlst);
		   
		  println(lst.size());
		   
		  def newlst1 = lst.sort();
		  println(newlst1);
	 
			   }
			}

