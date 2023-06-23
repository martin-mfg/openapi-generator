<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Dummy200Response
{
    /**
     * @DTA\Data(field="outerProp", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Dummy200ResponseOuterProp::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Dummy200ResponseOuterProp::class})
     * @var \App\DTO\Dummy200ResponseOuterProp|null
     */
    public $outer_prop;

}
