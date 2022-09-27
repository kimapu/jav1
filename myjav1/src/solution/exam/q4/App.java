package solution.exam.q4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws Exception
	{

		String path = "src/solution/exam/q4/tranx.txt";
		
		new App().new MyReader().getAll(path).forEach( System.out :: println );
		
	}

	class MyReader
	{
		List<Transaction> getAll(String loc) throws Exception
		{
			return Files.readAllLines(Paths.get(loc)).stream()
					.map( e -> {
						String[] token = e.split("\\|");
						return new Transaction(
								token[0],
								token[1],
								token[2],
								Double.parseDouble(token[3])
								);
					} )
					.collect( Collectors.toCollection(ArrayList :: new ) );
		}
	}
	
	class Transaction
	{
		String from, to, type;
		double amount;
		
		public Transaction(String from, String to, String type, double amount) {
			super();
			this.from = from;
			this.to = to;
			this.type = type;
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Transaction [from=" + from + ", to=" + to + ", type=" + type + ", amount=" + amount + "]";
		}
	}
}
