package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final NavigationLibraryAccessors laccForNavigationLibraryAccessors = new NavigationLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for androidxComposeCompiler (androidx.compose.compiler:compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeCompiler() {
            return create("androidxComposeCompiler");
    }

        /**
         * Creates a dependency provider for androidxComposeFoundation (androidx.compose.foundation:foundation)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeFoundation() {
            return create("androidxComposeFoundation");
    }

        /**
         * Creates a dependency provider for androidxComposeFoundationLayout (androidx.compose.foundation:foundation-layout)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeFoundationLayout() {
            return create("androidxComposeFoundationLayout");
    }

        /**
         * Creates a dependency provider for androidxComposeRuntime (androidx.compose.runtime:runtime)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeRuntime() {
            return create("androidxComposeRuntime");
    }

        /**
         * Creates a dependency provider for androidxComposeRuntimeLivedata (androidx.compose.runtime:runtime-livedata)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeRuntimeLivedata() {
            return create("androidxComposeRuntimeLivedata");
    }

        /**
         * Creates a dependency provider for androidxComposeUi (androidx.compose.ui:ui)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUi() {
            return create("androidxComposeUi");
    }

        /**
         * Creates a dependency provider for androidxComposeUiGraphics (androidx.compose.ui:ui-graphics)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiGraphics() {
            return create("androidxComposeUiGraphics");
    }

        /**
         * Creates a dependency provider for androidxComposeUiTestJunit4 (androidx.compose.ui:ui-test-junit4)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiTestJunit4() {
            return create("androidxComposeUiTestJunit4");
    }

        /**
         * Creates a dependency provider for androidxComposeUiTestManifest (androidx.compose.ui:ui-test-manifest)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiTestManifest() {
            return create("androidxComposeUiTestManifest");
    }

        /**
         * Creates a dependency provider for androidxComposeUiText (androidx.compose.ui:ui-text)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiText() {
            return create("androidxComposeUiText");
    }

        /**
         * Creates a dependency provider for androidxComposeUiTooling (androidx.compose.ui:ui-tooling)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiTooling() {
            return create("androidxComposeUiTooling");
    }

        /**
         * Creates a dependency provider for androidxComposeUiUnit (androidx.compose.ui:ui-unit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxComposeUiUnit() {
            return create("androidxComposeUiUnit");
    }

        /**
         * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() {
            return create("appcompat");
    }

        /**
         * Creates a dependency provider for bentoAssets (com.deliveryhero.design-tokens-android:assets)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBentoAssets() {
            return create("bentoAssets");
    }

        /**
         * Creates a dependency provider for bentoComposeComponentsCore (com.deliveryhero.pd-bento:components-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBentoComposeComponentsCore() {
            return create("bentoComposeComponentsCore");
    }

        /**
         * Creates a dependency provider for bentoComposeFoundation (com.deliveryhero.pd-bento:foundation)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBentoComposeFoundation() {
            return create("bentoComposeFoundation");
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

    /**
     * Returns the group of libraries at navigation
     */
    public NavigationLibraryAccessors getNavigation() {
        return laccForNavigationLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class NavigationLibraryAccessors extends SubDependencyFactory {
        private final NavigationRuntimeLibraryAccessors laccForNavigationRuntimeLibraryAccessors = new NavigationRuntimeLibraryAccessors(owner);

        public NavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("navigation.compose");
        }

        /**
         * Returns the group of libraries at navigation.runtime
         */
        public NavigationRuntimeLibraryAccessors getRuntime() {
            return laccForNavigationRuntimeLibraryAccessors;
        }

    }

    public static class NavigationRuntimeLibraryAccessors extends SubDependencyFactory {

        public NavigationRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("navigation.runtime.ktx");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidxCompose (1.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxCompose() { return getVersion("androidxCompose"); }

            /**
             * Returns the version associated to this alias: androidxComposeCompiler (1.4.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxComposeCompiler() { return getVersion("androidxComposeCompiler"); }

            /**
             * Returns the version associated to this alias: androidxComposeFoundation (1.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxComposeFoundation() { return getVersion("androidxComposeFoundation"); }

            /**
             * Returns the version associated to this alias: appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: bentoAssets (1.70.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBentoAssets() { return getVersion("bentoAssets"); }

            /**
             * Returns the version associated to this alias: bentoCompose (2.26.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBentoCompose() { return getVersion("bentoCompose"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: navigationCompose (2.7.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigationCompose() { return getVersion("navigationCompose"); }

            /**
             * Returns the version associated to this alias: navigationRuntimeKtx (2.7.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigationRuntimeKtx() { return getVersion("navigationRuntimeKtx"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for bentoCompose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.deliveryhero.pd-bento:components-core</li>
             *    <li>com.deliveryhero.pd-bento:foundation</li>
             *    <li>com.deliveryhero.design-tokens-android:assets</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBentoCompose() {
                return createBundle("bentoCompose");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
