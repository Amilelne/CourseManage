package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import settingcourse.CourseService;

public class TestCourseService {

	@Test
	public void test() {
		//ʵ����һ��CourseService
		CourseService courseService = new CourseService();
		//����getCourseNameById����,�ṩ��������"1"
		String str = courseService.getCourseNameById(1);
		//�ȶԷ��ص������Ƿ���"OOAD"
		assertEquals("OOAD", str);
	}

}
