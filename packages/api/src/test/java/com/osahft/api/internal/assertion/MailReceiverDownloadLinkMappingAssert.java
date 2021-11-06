package com.osahft.api.internal.assertion;

import com.osahft.api.document.MailReceiverDownloadLinkMapping;

/**
 * {@link MailReceiverDownloadLinkMapping} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractMailReceiverDownloadLinkMappingAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class MailReceiverDownloadLinkMappingAssert extends AbstractMailReceiverDownloadLinkMappingAssert<MailReceiverDownloadLinkMappingAssert, MailReceiverDownloadLinkMapping> {

    /**
     * Creates a new <code>{@link MailReceiverDownloadLinkMappingAssert}</code> to make assertions on actual MailReceiverDownloadLinkMapping.
     *
     * @param actual the MailReceiverDownloadLinkMapping we want to make assertions on.
     */
    public MailReceiverDownloadLinkMappingAssert(MailReceiverDownloadLinkMapping actual) {
        super(actual, MailReceiverDownloadLinkMappingAssert.class);
    }

    /**
     * An entry point for MailReceiverDownloadLinkMappingAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myMailReceiverDownloadLinkMapping)</code> and get specific assertion with code completion.
     *
     * @param actual the MailReceiverDownloadLinkMapping we want to make assertions on.
     * @return a new <code>{@link MailReceiverDownloadLinkMappingAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static MailReceiverDownloadLinkMappingAssert assertThat(MailReceiverDownloadLinkMapping actual) {
        return new MailReceiverDownloadLinkMappingAssert(actual);
    }
}
