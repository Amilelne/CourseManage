package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import settingcourse.CourseService;

public class TestCourseService {

	@Test
	public void test() {
		//实例化一个CourseService
		CourseService courseService = new CourseService();
		//调用getCourseNameById函数,提供测试数据"1"
		String str = courseService.getCourseNameById(1);
		//比对返回的数据是否是"OOAD"
		assertEquals("OOAD", str);
	}

}
