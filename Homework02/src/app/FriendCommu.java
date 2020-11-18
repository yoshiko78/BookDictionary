package app;

public class FriendCommu implements Communication{
	@Override
	public String greet(String name) throws Exception{
		if("パパ".equals(name)) {
			throw new HazukasiiException("パパは関係ないから来ないで！");
		} else if ("上司".equals(name)) {
			throw new OdorokiException("げっ！何でここに上司が・・・");
		}
		return name + "久しぶり～、元気だった？";
	}
}
