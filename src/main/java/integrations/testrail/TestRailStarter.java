package integrations.testrail;

import com.codepine.api.testrail.TestRail;
import com.codepine.api.testrail.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRailStarter {
    private static Integer testRunId;
    private static final Map<Integer, Result> resultsForTestCase = new HashMap<>();

    public static void main(String[] args) {
        createTestCase();
    }

    private static TestRail getTestRail() {
        return TestRail
                .builder("https://testvadym123.testrail.io",
                        "sulawados312000@gmail.com",
                        "akD85k9LGKdgKci_"
                )
                .applicationName("Test simple project")
                .build();
    }

    private static void createNewTestRun() {
        testRunId = getTestRail()
                .runs()
                .add(1, new Run()
                        .setDescription("Перевірка одного тест кейсу")
                        .setCaseIds(List.of(1)))
                .execute()
                .getId();
    }

    private static void markTestAsPassedInTestRun() {
        List<ResultField> resultFields = getTestRail().resultFields().list().execute();
//        resultsForTestCase
//                .forEach((caseId, result) -> getTestRail()
//                        .results()
//                        .addForCase(testRunId, caseId, result, resultFields)
//                        .execute());
        Result result = new Result().setComment("Тест пройшов успішно").setStatusId(1);
        getTestRail().results().addForCase(testRunId, 1, result, resultFields).execute();
    }

    public static void createTestCase() {
        Section section = new Section().setName("Нова секція, сворена за допомогою інтеграції");
        Case testCase = new Case().setTitle("Тест кейс створений за допомогою інтеграції");
        int sectionId = getTestRail().sections().add(1, section).execute().getId();
        testCase.setCustomFields(Map.of("steps", "Перший крок", "expected", "Очікування для першого кроку"));
        getTestRail().cases().add(sectionId, testCase, getTestRail().caseFields().list().execute()).execute();
    }
}

