package optional;

import java.time.Duration;

public class Progress {
    private Duration studyDuration;
    private boolean isFinished;

    public Progress(Duration studyDuration, boolean isFinished) {
        this.studyDuration = studyDuration;
        this.isFinished = isFinished;
    }

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
