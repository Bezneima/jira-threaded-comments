package ut.com.atlassian.jira.threadedcomments;

import org.junit.Test;
import com.atlassian.jira.threadedcomments.MyPluginComponent;
import com.atlassian.jira.threadedcomments.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}