package racing;

public class Utils {

	/**
	 * userNames split기능
	 * @param userNames : Scanner를 통한 유저 입력
	 * @param split : delimiter 입력
	 * @return
	 */
	public static String[] userNameSplit(String userNames, String split) {
		return userNames.split(split);
	}

}
