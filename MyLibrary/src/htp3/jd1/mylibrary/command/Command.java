package htp3.jd1.mylibrary.command;

import htp3.jd1.mylibrary.bean.*;

public interface Command {
	Response execute(Request request);
}
