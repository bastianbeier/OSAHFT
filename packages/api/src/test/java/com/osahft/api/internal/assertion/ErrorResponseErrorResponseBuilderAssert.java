package com.osahft.api.internal.assertion;

import com.osahft.api.model.ErrorResponse;

/**
 * {@link ErrorResponse.ErrorResponseBuilder} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractErrorResponseErrorResponseBuilderAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class ErrorResponseErrorResponseBuilderAssert extends AbstractErrorResponseErrorResponseBuilderAssert<ErrorResponseErrorResponseBuilderAssert, ErrorResponse.ErrorResponseBuilder> {

    /**
     * Creates a new <code>{@link ErrorResponseErrorResponseBuilderAssert}</code> to make assertions on actual ErrorResponse.ErrorResponseBuilder.
     *
     * @param actual the ErrorResponse.ErrorResponseBuilder we want to make assertions on.
     */
    public ErrorResponseErrorResponseBuilderAssert(ErrorResponse.ErrorResponseBuilder actual) {
        super(actual, ErrorResponseErrorResponseBuilderAssert.class);
    }

    /**
     * An entry point for ErrorResponseErrorResponseBuilderAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myErrorResponse.ErrorResponseBuilder)</code> and get specific assertion with code completion.
     *
     * @param actual the ErrorResponse.ErrorResponseBuilder we want to make assertions on.
     * @return a new <code>{@link ErrorResponseErrorResponseBuilderAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static ErrorResponseErrorResponseBuilderAssert assertThat(ErrorResponse.ErrorResponseBuilder actual) {
        return new ErrorResponseErrorResponseBuilderAssert(actual);
    }
}
